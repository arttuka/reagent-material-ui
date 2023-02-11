(ns reagent-mui.base.portal
  "Imports @mui/base/Portal as a Reagent component.
   Original documentation is at https://mui.com/base/api/portal/ ."
  (:require [reagent.core :as r]
            ["@mui/base/Portal" :as MuiPortal]))

(def portal (r/adapt-react-class (.-default MuiPortal)))
