(ns reagent-material-ui.core.input-adornment
  "Imports @material-ui/core/InputAdornment as a Reagent component.
   Original documentation is at https://material-ui.com/api/input-adornment/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/InputAdornment" :as InputAdornment]))

(def input-adornment (adapt-react-class (or (.-default InputAdornment) (.-InputAdornment InputAdornment)) "mui-input-adornment"))
