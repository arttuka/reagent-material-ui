(ns reagent-material-ui.icons.h-mobiledata-outlined
  "Imports @material-ui/icons/HMobiledataOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def h-mobiledata-outlined (create-svg-icon (e "path" #js {"d" "M15 11H9V7H7v10h2v-4h6v4h2V7h-2v4z"})
                                            "HMobiledataOutlined"))
