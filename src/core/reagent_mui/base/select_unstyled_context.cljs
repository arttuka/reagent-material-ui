(ns reagent-mui.base.select-unstyled-context
  "Imports @mui/base/SelectUnstyled/SelectUnstyledContext as a Reagent component.
   Original documentation is at https://mui.com/base/api/select-unstyled-context/ ."
  (:require [reagent.core :as r]
            ["@mui/base/SelectUnstyled" :as MuiSelectUnstyled]
            [reagent-mui.util :refer [clj->js']]))

(defn select-unstyled-context-provider [{:keys [value]} & children]
  [:> MuiSelectUnstyled/SelectUnstyledContext.Provider {:value (clj->js' value)}
   children])
