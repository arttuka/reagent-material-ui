(ns reagent-material-ui.icons.monitor-weight
  "Imports @material-ui/icons/MonitorWeight as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def monitor-weight (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm-7 9c-1.66 0-3-1.34-3-3s1.34-3 3-3 3 1.34 3 3-1.34 3-3 3z"}) (e "path" #js {"d" "M10 8.5h1v1h-1zm1.5 0h1v1h-1zm1.5 0h1v1h-1z"}))
                                     "MonitorWeight"))
