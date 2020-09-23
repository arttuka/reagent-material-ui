(ns reagent-material-ui.icons.mms-outlined
  "Imports @material-ui/icons/MmsOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def mms-outlined (create-svg-icon (e "path" #js {"d" "M20 2H4c-1.1 0-2 .9-2 2v18l4-4h14c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm0 14H5.17L4 17.17V4h16v12zm-5.5-8L11 12.51 8.5 9.5 5 14h14z"})
                                   "MmsOutlined"))
