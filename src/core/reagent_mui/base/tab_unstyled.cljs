(ns reagent-mui.base.tab-unstyled
  "Imports @mui/base/TabUnstyled as a Reagent component.
   Original documentation is at https://mui.com/base/api/tab-unstyled/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/base/TabUnstyled" :as MuiTabUnstyled]))

(def tab-unstyled (adapt-react-class (.-default MuiTabUnstyled) "mui-tab-unstyled"))
