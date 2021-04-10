(ns reagent-material-ui.icons.amp-stories-two-tone
  "Imports @material-ui/icons/AmpStoriesTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def amp-stories-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M9 6h6v11H9z", "opacity" ".3"}) (e "path" #js {"d" "M7 19h10V4H7v15zM9 6h6v11H9V6zM3 6h2v11H3zM19 6h2v11h-2z"}))
                                           "AmpStoriesTwoTone"))
