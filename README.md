# reagent-material-ui

**reagent-material-ui** is a [Reagent](http://reagent-project.github.io/) wrapper
for [Material UI v4](https://material-ui.com/).

The purpose of this library is to help ClojureScript/Reagent developers use a modern React UI library
without the hassle that Reagent/React interop usually is. It is meant to be comprehensive and up to date.

### Getting started

If you aren't familiar with [Material UI or its documentation](https://material-ui.com) yet, that is the best place to start.
Their examples are very good. and this library tries to follow the original ideas as well as possible.

To add Material UI to an existing Reagent project, you should only need to add the project to your dependencies:
```
[arttuka/reagent-material-ui "4.4.3-0"]
```

### Usage

Most of the library is in the form of regular Reagent components. Reagent and/or this library will take care of transforming
data into Javascript form and back, so you can just write ClojureScript which is obviously what you like to do.

All keywords should be automatically converted between kebab-case and camelCase, so as a CLJS developer
you'll only deal with kebab-case.

### Common pitfalls in Reagent/React interop

* Some components want to have a React node as a prop. A Reagent component is not good enough and will just result in
  errors about invalid React nodes. `reagent.core/as-element` can turn a Reagent component into a React node.
* React hooks can't be used in most Reagent components. [More information](http://reagent-project.github.io/docs/master/ReactFeatures.html#hooks).
* Most higher order React components can only deal with components that take all their parameters
  (including children) in a single map.

### Development

Bug reports, pull requests and ideas for improvement are very welcome. Outside tests, this project doesn't yet have
a live web playground for testing things. No external services are needed for getting the thing up and running.

### Tests

There are two ways to run tests:
* Single run from the command line with `lein test`
* Web test frontend with automatic code reloading with `lein figwheel`

The build process also includes `lein cljfmt`. 

### Version numbers

The project follows Material UI's version numbering.

### License

This project is licensed under the [Eclipse Public License 2.0](https://www.eclipse.org/legal/epl-2.0/).
