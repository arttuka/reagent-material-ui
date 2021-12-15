(ns reagent-mui.base.form-control-unstyled
  "Imports @mui/base/FormControlUnstyled as a Reagent component.
   Original documentation is at https://mui.com/api/form-control-unstyled/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/base/FormControlUnstyled" :as MuiFormControlUnstyled]))

(def form-control-unstyled (adapt-react-class (.-default MuiFormControlUnstyled) "mui-form-control-unstyled"))
