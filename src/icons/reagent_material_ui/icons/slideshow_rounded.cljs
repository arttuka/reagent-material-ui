(ns reagent-material-ui.icons.slideshow-rounded
  "Imports @material-ui/icons/SlideshowRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def slideshow-rounded (create-svg-icon (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm-3.81 9.84l-4.15 2.67c-.67.43-1.54-.05-1.54-.84V9.33c0-.79.88-1.27 1.54-.84l4.15 2.67c.61.39.61 1.29 0 1.68z"})
                                        "SlideshowRounded"))
