(ns reagent-material-ui.icons.change-history-outlined
  "Imports @material-ui/icons/ChangeHistoryOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def change-history-outlined (create-svg-icon (e "path" #js {"d" "M12 7.77L18.39 18H5.61L12 7.77M12 4L2 20h20L12 4z"})
                                              "ChangeHistoryOutlined"))
