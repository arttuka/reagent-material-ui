(ns reagent-mui.base.button-unstyled
  "Imports @mui/base/ButtonUnstyled as a Reagent component.
   Original documentation is at https://mui.com/base/api/button-unstyled/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/base/ButtonUnstyled" :as MuiButtonUnstyled]))

(def button-unstyled (adapt-react-class (.-default MuiButtonUnstyled) "mui-button-unstyled"))
