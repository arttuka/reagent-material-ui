(ns reagent-material-ui.icons.video-library-two-tone
  "Imports @material-ui/icons/VideoLibraryTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def video-library-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M8 16h12V4H8v12zm4-10.5l6 4.5-6 4.5v-9z", "opacity" ".3"}) (e "path" #js {"d" "M4 6H2v14c0 1.1.9 2 2 2h14v-2H4V6zm16-4H8c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm0 14H8V4h12v12zM12 5.5v9l6-4.5z"}))
                                             "VideoLibraryTwoTone"))
