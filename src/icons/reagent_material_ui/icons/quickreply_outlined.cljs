(ns reagent-material-ui.icons.quickreply-outlined
  "Imports @material-ui/icons/QuickreplyOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def quickreply-outlined (create-svg-icon [(e "path" #js {"d" "M4 17.17V4h16v6h2V4c0-1.1-.9-2-2-2H4c-1.1 0-1.99.9-1.99 2L2 22l4-4h9v-2H5.17L4 17.17z"}) (e "path" #js {"d" "M22.5 16h-2.2l1.7-4h-5v6h2v5z"})]
                                          "QuickreplyOutlined"))
