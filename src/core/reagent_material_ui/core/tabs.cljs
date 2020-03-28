(ns reagent-material-ui.core.tabs
  "Imports @material-ui/core/Tabs as a Reagent component.
   Original documentation is at https://material-ui.com/api/tabs/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Tabs" :as Tabs]))

(def tabs (adapt-react-class (or (.-default Tabs) (.-Tabs Tabs)) "mui-tabs"))
