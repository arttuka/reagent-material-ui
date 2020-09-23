(ns reagent-material-ui.icons.analytics-outlined
  "Imports @material-ui/icons/AnalyticsOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def analytics-outlined (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 16H5V5h14v14z"}) (e "path" #js {"d" "M7 12h2v5H7zM15 7h2v10h-2zM11 14h2v3h-2zM11 10h2v2h-2z"}))
                                         "AnalyticsOutlined"))
