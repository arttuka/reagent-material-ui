(ns reagent-material-ui.icons.slideshow-two-tone
  "Imports @material-ui/icons/SlideshowTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def slideshow-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M5 19h14V5H5v14zm5-11l5 4-5 4V8z", "opacity" ".3"}) (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 16H5V5h14v14zM10 8v8l5-4z"}))
                                         "SlideshowTwoTone"))
