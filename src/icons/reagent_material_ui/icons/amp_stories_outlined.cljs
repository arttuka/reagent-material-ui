(ns reagent-material-ui.icons.amp-stories-outlined
  "Imports @material-ui/icons/AmpStoriesOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def amp-stories-outlined (create-svg-icon (e "path" #js {"d" "M7 19h10V4H7v15zM9 6h6v11H9V6zM3 6h2v11H3zM19 6h2v11h-2z"})
                                           "AmpStoriesOutlined"))
