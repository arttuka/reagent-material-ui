(ns reagent-material-ui.icons.auto-awesome-mosaic-outlined
  "Imports @material-ui/icons/AutoAwesomeMosaicOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def auto-awesome-mosaic-outlined (create-svg-icon (e "path" #js {"d" "M3 5v14c0 1.1.89 2 2 2h6V3H5c-1.11 0-2 .9-2 2zm6 14H5V5h4v14zM19 3h-6v8h8V5c0-1.1-.9-2-2-2zm0 6h-4V5h4v4zm-6 12h6c1.1 0 2-.9 2-2v-6h-8v8zm2-6h4v4h-4v-4z"})
                                                   "AutoAwesomeMosaicOutlined"))
