# tibco-bw

A model of Tibco BusinessWorks artifacts for demonstration of model-driven legacy modernization.

## Overview

This repository contains an [Xcore](https://wiki.eclipse.org/Xcore) metamodel for
[TIBCO BusinessWorks 5.x](https://docs.tibco.com/products/tibco-businessworks-5-14-0) processes.
The model can be used to:

- Parse and analyse BW 5.x `.process` files programmatically
- Build tooling for legacy modernization (e.g. migration to BW 6.x / cloud-native stacks)
- Generate documentation or metrics from existing process definitions

## Model

The model is defined in [`model/tibcobw.xcore`](model/tibcobw.xcore).

### Key concepts

| Class | Description |
|-------|-------------|
| `ProcessDefinition` | Root element of a `.process` file; corresponds to `pd:ProcessDefinition` in the XML namespace `http://xmlns.tibco.com/bw/process/2003`. |
| `NamedElement` | Abstract base for elements identified by name within a process. |
| `Activity` | A task or step in the process (`pd:activity`). |
| `Starter` | An event-source activity that triggers the process (`pd:starter`), e.g. HTTP receiver, JMS queue listener, Timer. |
| `Group` | A structured container for sub-activities (`pd:group`), used for loops, error handlers, critical sections, etc. |
| `Transition` | A directed connection between activities (`pd:transition`). |
| `Label` | A visual annotation placed on the design canvas (`pd:label`). |
| `ProcessVariable` | A process-scoped variable declared in the `processVariables` section. |

### Class diagram (simplified)

```
ProcessDefinition
  ├── starter : Starter          (0..1)
  ├── activities : Activity[]
  ├── groups : Group[]
  ├── transitions : Transition[]
  ├── labels : Label[]
  └── processVariables : ProcessVariable[]

NamedElement (abstract)
  ├── Activity   (name, type, resourceType, x, y, config, inputBindings)
  │     └── Starter
  └── Group      (name, type, resourceType, x, y, width, height, ...)
        ├── activities : Activity[]
        ├── groups : Group[]
        └── transitions : Transition[]

Transition  (from, to, lineType, lineColor, conditionType, condition)
Label       (name, description, x, y, width, height, fontColor, color, ...)
ProcessVariable (name, type, description)
```

## References

- [fastconnect/tibco-bwmaven – process model schema](https://github.com/fastconnect/tibco-bwmaven/tree/master/tibco-bw-process-model-schema)
- [joshuamoesa/tibco-businessworks5 – sample projects](https://github.com/joshuamoesa/tibco-businessworks5)
- [tibcobwblog/tibcobwblog_samples – BW 5.x samples](https://github.com/tibcobwblog/tibcobwblog_samples/tree/master/bw5.x)
- [Eclipse Xcore documentation](https://wiki.eclipse.org/Xcore)
