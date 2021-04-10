(ns reagent-material-ui.icons.perm-media-two-tone
  "Imports @material-ui/icons/PermMediaTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def perm-media-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M13.17 6l-.59-.59L11.17 4H6v12h16V6h-8.83zm4.33 4.5L21 15H7l4.5-6 3.5 4.51 2.5-3.01z", "opacity" ".3"}) (e "path" #js {"d" "M2 6H0v5h.01L0 20c0 1.1.9 2 2 2h18v-2H2V6zm5 9h14l-3.5-4.5-2.5 3.01L11.5 9zM22 4h-8l-2-2H6c-1.1 0-1.99.9-1.99 2L4 16c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zm0 12H6V4h5.17l1.41 1.41.59.59H22v10z"}))
                                          "PermMediaTwoTone"))
