# Changelog

See [MUI changelog](https://github.com/mui-org/material-ui/blob/master/CHANGELOG.md) for changes in MUI.

## 5.4.3-0

**[compare](https://github.com/arttuka/reagent-material-ui/compare/v5.2.4-0...v5.4.3-0)**

- Update MUI to v5.4.3
- Use local timezone instead of UTC by default in `reagent-mui/cljs-time-adapter` (#30) @patapizza
- Allow string as component in `reagent-mui.styles/styled`

## 5.2.4-0

**[compare](https://github.com/arttuka/reagent-material-ui/compare/v5.0.0-0...v5.2.4-0)**

- Update MUI to v5.2.4
- **BREAKING** Rename package `reagent-mui.core` to `reagent-mui.base` as in MUI
- Fix React key warnings on some icons (#27)
- Add support for MUI X Pro components (currently just DataGrid) (#25)

## 5.0.0-0

**[compare](https://github.com/arttuka/reagent-material-ui/compare/v5.0.0-beta.5-0...v5.0.0-0)**

- Update MUI to v5.0.0
- **BREAKING** Rename packages according to new MUI packages:
  - `reagent-material-ui.core` becomes `reagent-mui.material`
  - `reagent-material-ui.unstyled` becomes `reagent-mui.core`
  - Other packages starting with `reagent-material-ui` are renamed to start with `reagent-mui`

## 5.0.0-beta.5-0

**[compare](https://github.com/arttuka/reagent-material-ui/compare/v5.0.0-beta.2-0...v5.0.0-beta.5-0)**

- Update Material UI to v5.0.0-beta.5
- Fix require bug when using `@material-ui/lab` with CLJSJS packages

## 5.0.0-beta.2-0

**[compare](https://github.com/arttuka/reagent-material-ui/compare/v5.0.0-alpha.32-0...v5.0.0-beta.2-0)**

- Update Material UI to v5.0.0-beta.2
- Add components from `@material-ui/unstyled`
- Move functions from `@material-ui/core/styles` and `@material-ui/styles` to separate namespaces
- Fix default locale in `localization-provider` (#19) @alenkralj

## 5.0.0-alpha.32-0

**[compare](https://github.com/arttuka/reagent-material-ui/compare/v5.0.0-alpha.29-0...v5.0.0-alpha.32-0)**

- Update Material UI to v5.0.0-alpha.32

## 5.0.0-alpha.29-0

**[compare](https://github.com/arttuka/reagent-material-ui/compare/v5.0.0-alpha.27-1...v5.0.0-alpha.29-0)**

- Update Material UI to v5.0.0-alpha.29
- Fix bug in `reagent-material-ui/js-clj'` when converting keys with non-keyword characters (#15) @adrsm108

## 5.0.0-alpha.27-1

**[compare](https://github.com/arttuka/reagent-material-ui/compare/v5.0.0-alpha.27-0...v5.0.0-alpha.27-1)**

- Move packaged Material UI to a separate dependency so it can be excluded
- Add source maps to dev versions of packaged Material UI
- Remove optional dependency of `@material-ui/lab` from `deps.cljs`

## 5.0.0-alpha.27-0

**[compare](https://github.com/arttuka/reagent-material-ui/compare/v5.0.0-alpha.20-0...v5.0.0-alpha.27-0)**

- Update Material UI to v5.0.0-alpha.27
- Add `deps.edn` for dependencies
- Add `@material-ui/core/styles/StylesProvider` as `reagent-material-ui.styles/styles-provider`

## 5.0.0-alpha.20-0

**[compare](https://github.com/arttuka/reagent-material-ui/compare/v5.0.0-alpha.18-0...v5.0.0-alpha.20-0)**

- Update Material UI to v5.0.0-alpha.20
- Update Reagent to v1.0.0

## 5.0.0-alpha.18-0

**[compare](https://github.com/arttuka/reagent-material-ui/compare/v5.0.0-alpha.17-0...v5.0.0-alpha.18-0)**

- Update Material UI to v5.0.0-alpha.18

## 5.0.0-alpha.17-0

**[compare](https://github.com/arttuka/reagent-material-ui/compare/v5.0.0-alpha.15-0...v5.0.0-alpha.17-0)**

- Update Material UI to v5.0.0-alpha.17
- **BREAKING** `material-ui-pickers` have been moved to `material-ui-lab`
- **BREAKING** `cljs-time-utils` has been renamed to `cljs-time-adapter` to use the same terminology as Material UI
- Added support for responsive font sizes (#9) @wkok
- Fix bug in `reagent-material-ui.core.text-field` when used as uncontrolled

## 5.0.0-alpha.15-0

**[compare](https://github.com/arttuka/reagent-material-ui/compare/v5.0.0-alpha.14-0...v5.0.0-alpha.15-0)**

- Update Material UI to v5.0.0-alpha.15
- Add missing components from `material-ui-pickers`

## 5.0.0-alpha.14-0

**[compare](https://github.com/arttuka/reagent-material-ui/compare/v5.0.0-alpha.12-0...v5.0.0-alpha.14-0)**

- Update Material UI to v5.0.0-alpha.14

## 5.0.0-alpha.12-0

**[compare](https://github.com/arttuka/reagent-material-ui/compare/v4.11.0-3...v5.0.0-alpha.12-0)**

- Update Material UI to v5.0.0-alpha.12. See [Material UI migration guide](https://next--material-ui.netlify.app/guides/migration-v4/) for a list of breaking changes.
- Add browser test runner
- **BREAKING**: Move utility macros from `reagent-material-ui.macro` to `reagent-material-ui.util`
- Add utility macro for creating React components. See the [example project](./example/src/example/core.cljs) for a simple usage example with `date-picker`.

## 4.11.0-3

**[compare](https://github.com/arttuka/reagent-material-ui/compare/v4.11.0-1...v4.11.0-3)**

- Split Material UI JS build into Core, Lab and Pickers to reduce build size when not using Lab and/or Pickers
- Fix some bugs and add missing functions in `cljs-time-utils`
- Fix bug in `reagent-material-ui.util/js->clj'` when converting React props that include refs or children

## 4.11.0-1

**[compare](https://github.com/arttuka/reagent-material-ui/compare/v4.11.0-0...v4.11.0-1)**

- Enable pure shadow-cljs usage (fixes #2)

## 4.11.0-0

**[compare](https://github.com/arttuka/reagent-material-ui/compare/v4.9.12-0...v4.11.0-0)**

- Update Material UI to v4.11.0
- Add missing Material UI Lab components to `deps.edn`

## 4.9.12-0

**[compare](https://github.com/arttuka/reagent-material-ui/compare/v4.9.8-0...v4.9.12-0)**

- Update Material UI to v4.9.12

## 4.9.8-0

**[compare](https://github.com/arttuka/reagent-material-ui/compare/v4.9.5-1...v4.9.8-0)**

- Update Material UI to v4.9.8
- Add support for shadow-cljs
- Remove dependency to CLJSJS Material UI
- Add [Material UI Lab](https://material-ui.com/components/about-the-lab/)

## 4.9.5-1

**[compare](https://github.com/arttuka/reagent-material-ui/compare/v4.9.5-0...v4.9.5-1)**

- Remove `ScopedCssBaseline` component that isn't included in CLJSJS Material UI package

## 4.9.5-0

**[compare](https://github.com/arttuka/reagent-material-ui/compare/v4.8.3-1...v4.9.5-0)**

- Update Material UI to v4.9.5

## 4.8.3-1

**[compare](https://github.com/arttuka/reagent-material-ui/compare/v4.8.3-0...v4.8.3-1)**

- Fix time zone handling in `cljs-time-utils`

## 4.8.3-0

**[compare](https://github.com/arttuka/reagent-material-ui/compare/v4.5.1-1...v4.8.3-0)**

- Update Material UI to v4.8.3
- Add `useFormControl`, `useRadioGroup`, `useMediaQuery`, and `useScrollTrigger` hooks from Material UI

## 4.5.1-1

**[compare](https://github.com/arttuka/reagent-material-ui/compare/v4.5.1-0...v4.5.1-1)**

- Fix [cursor jumping](https://github.com/reagent-project/reagent/blob/master/doc/examples/material-ui.md)
  in textfields

## 4.5.1-0

- Update Material UI to v4.5.1
- Add [Material UI pickers](https://material-ui-pickers.dev/) v3.2.7
