(ns reagent-material-ui.icons.photo-camera-back-outlined
  "Imports @material-ui/icons/PhotoCameraBackOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def photo-camera-back-outlined (create-svg-icon [(e "path" #js {"d" "M20 5h-3.17L15 3H9L7.17 5H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V7c0-1.1-.9-2-2-2zm0 14H4V7h4.05l1.83-2h4.24l1.83 2H20v12z"}) (e "path" #js {"d" "M11.25 16 9 13l-3 4h12l-3.75-5z"})]
                                                 "PhotoCameraBackOutlined"))
