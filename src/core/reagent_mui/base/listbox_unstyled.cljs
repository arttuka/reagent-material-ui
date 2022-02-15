(ns reagent-mui.base.listbox-unstyled
  "Imports @mui/base/ListboxUnstyled as a Reagent component.
   Original documentation is at https://mui.com/api/listbox-unstyled/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/base/ListboxUnstyled" :as MuiListboxUnstyled]))

(def listbox-unstyled (adapt-react-class (.-default MuiListboxUnstyled) "mui-listbox-unstyled"))
