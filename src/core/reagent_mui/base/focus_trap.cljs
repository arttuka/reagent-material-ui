(ns reagent-mui.base.focus-trap
  "Imports @mui/base/FocusTrap as a Reagent component.
   Original documentation is at https://mui.com/base/api/focus-trap/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/base/FocusTrap" :as MuiFocusTrap]))

(def focus-trap (adapt-react-class (.-default MuiFocusTrap) "mui-focus-trap"))
