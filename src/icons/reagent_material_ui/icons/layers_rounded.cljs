(ns reagent-material-ui.icons.layers-rounded
  "Imports @material-ui/icons/LayersRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def layers-rounded (create-svg-icon (e "path" #js {"d" "M11.99 18.47l-6.77-5.26a.991.991 0 0 0-1.22 0c-.51.4-.51 1.17 0 1.57l6.76 5.26c.72.56 1.73.56 2.46 0l6.76-5.26c.51-.4.51-1.17 0-1.57l-.01-.01a.991.991 0 0 0-1.22 0l-6.76 5.27zm1.24-3.5l6.76-5.26c.51-.4.51-1.18 0-1.58l-6.76-5.26c-.72-.56-1.73-.56-2.46 0L4.01 8.14c-.51.4-.51 1.18 0 1.58l6.76 5.26c.72.56 1.74.56 2.46-.01z"})
                                     "LayersRounded"))
