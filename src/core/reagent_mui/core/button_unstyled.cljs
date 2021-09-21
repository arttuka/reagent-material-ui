(ns reagent-mui.core.button-unstyled
  "Imports @mui/core/ButtonUnstyled as a Reagent component.
   Original documentation is at https://mui.com/api/button-unstyled/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/core/ButtonUnstyled" :as MuiButtonUnstyled]))

(def button-unstyled (adapt-react-class (.-default MuiButtonUnstyled) "mui-button-unstyled"))
