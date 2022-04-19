(ns reagent-mui.base.input-unstyled
  "Imports @mui/base/InputUnstyled as a Reagent component.
   Original documentation is at https://mui.com/base/api/input-unstyled/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/base/InputUnstyled" :as MuiInputUnstyled]))

(def input-unstyled (adapt-react-class (.-default MuiInputUnstyled) "mui-input-unstyled"))
