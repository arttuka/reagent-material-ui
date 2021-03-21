# reagent-material-ui

[![Actions Status](https://github.com/arttuka/reagent-material-ui/workflows/CI/badge.svg)](https://github.com/arttuka/reagent-material-ui/actions)

**reagent-material-ui** is a [Reagent](http://reagent-project.github.io/) wrapper
for [Material UI v4](https://material-ui.com/).

Alpha versions for Material UI v5 can be found on branch [next](https://github.com/arttuka/reagent-material-ui/tree/next).

The purpose of this library is to help ClojureScript/Reagent developers use a modern React UI library
without the hassle that Reagent/React interop usually is. It is meant to be comprehensive and up to date.

### Usage

If you aren't familiar with [Material UI or its documentation](https://material-ui.com) yet, that is the best place to start.
Their examples are very good. and this library tries to follow the original ideas as well as possible. See the [example project](./example) for a simple usage example.

To add Material UI to an existing Reagent project, just add this library to your dependencies:
```
[arttuka/reagent-material-ui "4.11.3-1"]
```

Most of the library is in the form of regular Reagent components. Each component is contained in a namespace that mirrors
Material UI's modules. For example, `@material-ui/core/IconButton` becomes `reagent-material-ui.core.icon-button/icon-button`
and `@material-ui/icons/Menu` becomes `reagent-material-ui.icons.menu/menu`.

Namespace `reagent-material-ui.components` contains a copy of each component from `@material-ui/core` for ease of use.

Namespace `reagent-material-ui.colors` contains all color definitions from `@material-ui/core/colors`.
The colors are organized in a single namespace, so `@material-ui/core/colors/red` becomes `reagent-material-ui.colors/red`.

Namespace `reagent-material-ui.styles` contains helper functions and components from `@material-ui/core/styles`.

#### material-ui-pickers

This library also includes date and time picker components from [Material-UI Pickers](https://material-ui-pickers.dev/).

Namespace `reagent-material-ui.pickers` contains all components from `@material-ui/pickers`.

Namespace `reagent-material-ui.cljs-time-utils` contains an utility package that lets you use the pickers with `cljs-time` (`goog.date`) date objects.
The locale prop must be an instance of `goog.i18n.DateTimeSymbols`. The default locale is used if no locale prop is given.
See the example project for a usage example.

#### material-ui-lab

This library also includes date and time picker components from [Material-UI Lab](https://material-ui.com/components/about-the-lab/).

Namespace `reagent-material-ui.lab` contains all components from `@material-ui/lab`.

#### Using npm dependencies with Figwheel Main

To use npm dependencies with Figwheel Main, you need to exclude prebuilt JS files (React from CLJSJS and Material UI from this library).
To do so, add these exclusions to your dependency. See the example project for working configuration.

    [arttuka/reagent-material-ui "4.11.3-1" :exclusions [cljsjs/react cljsjs/react-dom cljsjs/react-dom-server arttuka/reagent-material-ui-js]]

#### Material UI component names with shadow-cljs

The compiler used by shadow-cljs will remove local function names, causing most Material UI component to
show as `Anonymous` in React Devtools. If you want to keep the names, add `:js-options {:anon-fn-naming-policy :unmapped}`
to your build in `shadow-cljs.edn`.

### Common pitfalls in Reagent/React interop

* Some components want to have a React node as a prop. A Reagent component is not good enough and will just result in
  errors about invalid React nodes. `reagent.core/as-element` can turn a Reagent component into a React node.
* React hooks can't be used in most Reagent components. [More information](https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks).
* Higher order React components can only deal with components that take all their parameters
  (including children) in a single map.
  
For more information, check out [Reagent's interop guide](https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/interop-with-react).

### Development

Bug reports, pull requests and ideas for improvement are very welcome. No external services are needed for getting the library up and running.

### Tests

Run tests with `npm test`.

The build process also includes `lein cljfmt`. 

### Version numbers

The project follows Material UI's version numbering.

* Current `@material-ui/core` version: `4.11.3`
* Current `@material-ui/icons` version: `4.10.2`
* Current `@material-ui/pickers` version: `3.2.10`
* Current `@material-ui/lab` version: `4.0.0-alpha.57`

### License

This project is licensed under the [Eclipse Public License 2.0](https://www.eclipse.org/legal/epl-2.0/).

Parts of example project are copyright (c) 2013-2017 Dan Holmsand and Reagent contributors, used under the terms of the MIT License. Material UI Icons are copyright (c) Material UI contributors, used under the terms of the MIT License. 
