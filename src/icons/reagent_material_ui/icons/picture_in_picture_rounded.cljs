(ns reagent-material-ui.icons.picture-in-picture-rounded
  "Imports @material-ui/icons/PictureInPictureRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def picture-in-picture-rounded (create-svg-icon (e "path" #js {"d" "M22 18.02V6c0-1.1-.9-2-2-2H4c-1.1 0-2 .9-2 2v12.02c0 1.1.9 1.98 2 1.98h16c1.1 0 2-.88 2-1.98zM19 8v4c0 .55-.45 1-1 1h-6c-.55 0-1-.45-1-1V8c0-.55.45-1 1-1h6c.55 0 1 .45 1 1z"})
                                                 "PictureInPictureRounded"))
