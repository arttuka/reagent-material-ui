(ns reagent-material-ui.icons.add-photo-alternate-two-tone
  "Imports @material-ui/icons/AddPhotoAlternateTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def add-photo-alternate-two-tone (create-svg-icon [(e "path" #js {"d" "m10.21 16.83-1.96-2.36L5.5 18h11l-3.54-4.71z"}) (e "path" #js {"d" "M16.5 18h-11l2.75-3.53 1.96 2.36 2.75-3.54L16.5 18zM17 7h-3V6H4v14h14V10h-1V7z", "opacity" ".3"}) (e "path" #js {"d" "M20 4V1h-2v3h-3v2h3v2.99h2V6h3V4zm-2 16H4V6h10V4H4c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V10h-2v10z"})]
                                                   "AddPhotoAlternateTwoTone"))
