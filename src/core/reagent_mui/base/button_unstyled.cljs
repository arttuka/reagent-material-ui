(ns reagent-mui.base.button-unstyled
  "Imports @mui/base/ButtonUnstyled as a Reagent component.
   Original documentation is at https://mui.com/base/api/button-unstyled/ ."
  (:require [reagent.core :as r]
            ["@mui/base/ButtonUnstyled" :as MuiButtonUnstyled]))

(def button-unstyled (r/adapt-react-class (.-default MuiButtonUnstyled)))
