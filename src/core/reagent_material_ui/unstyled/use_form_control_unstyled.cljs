(ns reagent-material-ui.unstyled.use-form-control-unstyled
  "Imports @material-ui/unstyled/FormControlUnstyled/useFormControlUnstyled as a React hook.
   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks
   Original documentation is at https://material-ui.com/api/use-form-control-unstyled/ ."
  (:require [reagent-material-ui.util :refer [wrap-js-function]]
            ["@material-ui/unstyled/FormControlUnstyled" :as MuiFormControlUnstyled]))

(def use-form-control-unstyled (wrap-js-function (.-useFormControlUnstyled MuiFormControlUnstyled)))
