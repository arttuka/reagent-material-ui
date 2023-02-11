(ns reagent-mui.base.focus-trap
  "Imports @mui/base/FocusTrap as a Reagent component.
   Original documentation is at https://mui.com/base/api/focus-trap/ ."
  (:require [reagent.core :as r]
            ["@mui/base/FocusTrap" :as MuiFocusTrap]))

(def focus-trap (r/adapt-react-class (.-default MuiFocusTrap)))
