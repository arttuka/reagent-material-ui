(ns reagent-material-ui.icons.fiber-manual-record-outlined
  "Imports @material-ui/icons/FiberManualRecordOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def fiber-manual-record-outlined (create-svg-icon (e "path" #js {"d" "M12 6c3.31 0 6 2.69 6 6s-2.69 6-6 6-6-2.69-6-6 2.69-6 6-6m0-2c-4.42 0-8 3.58-8 8s3.58 8 8 8 8-3.58 8-8-3.58-8-8-8z"})
                                                   "FiberManualRecordOutlined"))
