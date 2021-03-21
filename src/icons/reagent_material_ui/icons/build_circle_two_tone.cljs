(ns reagent-material-ui.icons.build-circle-two-tone
  "Imports @material-ui/icons/BuildCircleTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def build-circle-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M12 4c-4.41 0-8 3.59-8 8s3.59 8 8 8 8-3.59 8-8-3.59-8-8-8z", "opacity" ".3"}) (e "path" #js {"d" "M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm0 18c-4.41 0-8-3.59-8-8s3.59-8 8-8 8 3.59 8 8-3.59 8-8 8z"}) (e "path" #js {"d" "M12.68 7.76c-1.11-1.11-2.79-1.3-4.1-.59l2.35 2.35-1.41 1.41-2.35-2.35c-.71 1.32-.52 2.99.59 4.1.98.98 2.4 1.24 3.62.81l3.41 3.41c.2.2.51.2.71 0l1.4-1.4c.2-.2.2-.51 0-.71l-3.41-3.41c.43-1.23.17-2.64-.81-3.62z"}))
                                            "BuildCircleTwoTone"))
