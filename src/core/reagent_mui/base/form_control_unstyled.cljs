(ns reagent-mui.base.form-control-unstyled
  "Imports @mui/base/FormControlUnstyled as a Reagent component.
   Original documentation is at https://mui.com/base/api/form-control-unstyled/ ."
  (:require [reagent.core :as r]
            ["@mui/base/FormControlUnstyled" :as MuiFormControlUnstyled]))

(def form-control-unstyled (r/adapt-react-class (.-default MuiFormControlUnstyled)))
