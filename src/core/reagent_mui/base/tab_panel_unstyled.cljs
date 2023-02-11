(ns reagent-mui.base.tab-panel-unstyled
  "Imports @mui/base/TabPanelUnstyled as a Reagent component.
   Original documentation is at https://mui.com/base/api/tab-panel-unstyled/ ."
  (:require [reagent.core :as r]
            ["@mui/base/TabPanelUnstyled" :as MuiTabPanelUnstyled]))

(def tab-panel-unstyled (r/adapt-react-class (.-default MuiTabPanelUnstyled)))
