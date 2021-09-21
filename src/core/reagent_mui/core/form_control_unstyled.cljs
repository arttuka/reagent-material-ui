(ns reagent-mui.core.form-control-unstyled
  "Imports @mui/core/FormControlUnstyled as a Reagent component.
   Original documentation is at https://mui.com/api/form-control-unstyled/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/core/FormControlUnstyled" :as MuiFormControlUnstyled]))

(def form-control-unstyled (adapt-react-class (.-default MuiFormControlUnstyled) "mui-form-control-unstyled"))
