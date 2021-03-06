# Changelog

See [Material UI changelog](https://github.com/mui-org/material-ui/blob/master/CHANGELOG.md) for changes in Material UI.

## 4.11.3-0

**[compare](https://github.com/arttuka/reagent-material-ui/compare/v4.11.2-0...v4.11.3-0)**

- Update Material UI to v4.11.3
- Downgrade React to v16.14.0

## 4.11.2-0

**[compare](https://github.com/arttuka/reagent-material-ui/compare/v4.11.0-4...v4.11.2-0)**

- Update Material UI to v4.11.2
- Update Reagent to v1.0.0

## 4.11.0-4

**[compare](https://github.com/arttuka/reagent-material-ui/compare/v4.11.0-3...v4.11.0-4)**

- Added support for responsive font sizes (#9) @wkok

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
