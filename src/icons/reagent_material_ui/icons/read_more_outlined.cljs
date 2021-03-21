(ns reagent-material-ui.icons.read-more-outlined
  "Imports @material-ui/icons/ReadMoreOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def read-more-outlined (create-svg-icon (e "path" #js {"d" "M13 7h9v2h-9zm0 8h9v2h-9zm3-4h6v2h-6zm-3 1L8 7v4H2v2h6v4z"})
                                         "ReadMoreOutlined"))
