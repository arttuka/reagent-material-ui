(ns reagent-material-ui.icons.video-stable-two-tone
  "Imports @material-ui/icons/VideoStableTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def video-stable-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M7.0627 13.3185l1.3204-4.926 8.558 2.2938-1.3205 4.9261z", "opacity" ".3"}) (e "path" #js {"d" "M20 4H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zM4 18V6h2.95l-2.33 8.73L16.82 18H4zm11.62-2.39l-8.55-2.29L8.38 8.4l8.56 2.29-1.32 4.92zM20 18h-2.95l2.34-8.73L7.18 6H20v12z"}))
                                            "VideoStableTwoTone"))
