(ns reagent-material-ui.icons.crop-original-rounded
  "Imports @material-ui/icons/CropOriginalRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def crop-original-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M7 17h10c.41 0 .65-.47.4-.8l-2.75-3.67c-.2-.27-.6-.27-.8 0L11.25 16 9.4 13.53c-.2-.27-.6-.27-.8 0l-2 2.67c-.25.33-.01.8.4.8z"}) (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 16H5V5h14v14z"}))
                                            "CropOriginalRounded"))
