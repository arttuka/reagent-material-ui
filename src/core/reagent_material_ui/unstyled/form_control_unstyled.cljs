(ns reagent-material-ui.unstyled.form-control-unstyled
  "Imports @material-ui/unstyled/FormControlUnstyled as a Reagent component.
   Original documentation is at https://material-ui.com/api/form-control-unstyled/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/unstyled/FormControlUnstyled" :as MuiFormControlUnstyled]))

(def form-control-unstyled (adapt-react-class (.-default MuiFormControlUnstyled) "mui-form-control-unstyled"))
