# reagent-material-ui

[![Actions Status](https://github.com/arttuka/reagent-material-ui/workflows/CI/badge.svg)](https://github.com/arttuka/reagent-material-ui/actions)

**reagent-material-ui** is a [Reagent](http://reagent-project.github.io/) wrapper
for [MUI (formerly Material UI) v5](https://mui.com/).

The purpose of this library is to help ClojureScript/Reagent developers use a modern React UI library
without the hassle that Reagent/React interop usually is. It is meant to be comprehensive and up to date.

### Usage

If you aren't familiar with [MUI or its documentation](https://mui.com) yet, that is the best place to start.
Their examples are very good. and this library tries to follow the original ideas as well as possible. See the [example project](./example) for a simple usage example.

To add MUI to an existing Reagent project, just add this library to your dependencies:
```
[arttuka/reagent-material-ui "5.11.12-0"]
```

Most of the library is in the form of regular Reagent components. Each component is contained in a namespace that mirrors
MUI's modules. For example, `@mui/material/IconButton` becomes `reagent-mui.material.icon-button/icon-button`
and `@mui/icons-material/Menu` becomes `reagent-mui.icons.menu/menu`.

Namespace `reagent-mui.components` contains a copy of each component from `@mui/material` for ease of use.

Namespace `reagent-mui.colors` contains all color definitions from `@mui/material/colors`.
The colors are organized in a single namespace, so `@mui/material/colors/red` becomes `reagent-mui.colors/red`.

Namespace `reagent-mui.styles` contains helper functions and components from `@mui/material/styles`.

Namespace `reagent-mui.jss-styles` contains helper functions and components from `@mui/styles`.

Namespace `reagent-mui.core` contains all components from `@mui/core`.

#### MUI Lab

This library also includes components from [MUI Lab](https://mui.com/components/about-the-lab/).

Namespace `reagent-mui.lab` contains all components from `@mui/lab`.

#### MUI X Pro

This library also includes components from [MUI X](https://mui.com/x/advanced-components/).
Namespace `reagent-mui.x` contains those components.

MUI X components are only supported in projects with NPM dependencies.
They can't be used in projects with CLJSJS sources.

Namespace `reagent-mui.cljs-time-adapter` contains an adapter that lets you use the date pickers with `cljs-time` (`goog.date`) date objects.
`reagent-mui.x.localization-provider` accepts this adapter as its `date-adapter` property.
The locale prop must be an instance of `goog.i18n.DateTimeSymbols`. The default locale is used if no locale prop is given.
See the example project for a usage example.

If you want to use another date library, you can use [adapters from `@mui/x-date-pickers`](https://mui.com/x/react-date-pickers/getting-started/#setup).

#### Using npm dependencies with Figwheel Main

To use npm dependencies with Figwheel Main, you need to exclude prebuilt JS files (React from CLJSJS and MUI from this library).
To do so, add these exclusions to your dependency. See the example project for working configuration.

    [arttuka/reagent-material-ui "5.11.12-0" :exclusions [arttuka/reagent-material-ui-js]]

#### MUI component names with shadow-cljs

The compiler used by shadow-cljs will remove local function names, causing most MUI component to
show as `Anonymous` in React Devtools. If you want to keep the names, add `:js-options {:anon-fn-naming-policy :unmapped}`
to your build in `shadow-cljs.edn`.

#### React 18

[Reagent v1.2.0](https://github.com/reagent-project/reagent/blob/master/CHANGELOG.md#120-2023-02-16) has experimental
support for React 18. This library works with Reagent 1.2.0 / React 18. See example project.

### Common pitfalls in Reagent/React interop

* Some components want to have a React node as a prop. A Reagent component is not good enough and will just result in
  errors about invalid React nodes. `reagent.core/as-element` can turn a Reagent component into a React node.
* React hooks can't be used in most Reagent components. [More information](https://cljdoc.org/d/reagent/reagent/1.1.1/doc/tutorials/react-features#hooks).
* Higher order React components can only deal with components that take all their parameters
  (including children) in a single map.
* MUI X DatePickers accept a `renderInput` prop. Rendering a Reagent element causes problems with cursor positioning.
  You should instead render a React element with `react/createElement`. See [this issue](https://github.com/arttuka/reagent-material-ui/issues/39).
  
For more information, check out [Reagent's interop guide](https://cljdoc.org/d/reagent/reagent/1.1.1/doc/tutorials/interop-with-react).

### Development

Bug reports, pull requests and ideas for improvement are very welcome. No external services are needed for getting the library up and running.

### Tests

Run tests on the command line with `npm run test`, or in the browser with `npm run test:browser`. The browser test runner will start at [localhost:9500](http://localhost:9500).

The build process also includes `lein cljfmt`. 

### Version numbers

The project follows MUI's version numbering.

* Current `@mui/material` version: `5.11.12`
* Current `@mui/icons-material` version: `5.11.11`
* Current `@mui/lab` version: `5.0.0-alpha.122`
* Current `@mui/x-date-pickers` version: `6.0.0`

### License

This project is licensed under the [Eclipse Public License 2.0](https://www.eclipse.org/legal/epl-2.0/).

Parts of example project are copyright (c) 2013-2017 Dan Holmsand and Reagent contributors, used under the terms of the MIT License. Material UI Icons are copyright (c) Material UI contributors, used under the terms of the MIT License. 
