(ns reagent-material-ui.icons.fireplace-rounded
  "Imports @material-ui/icons/FireplaceRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def fireplace-rounded (create-svg-icon (e "path" #js {"d" "M20 2H4c-1.1 0-2 .9-2 2v16c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm-9.4 14.97c.76-.25 1.4-1.04 1.53-1.63.13-.56-.1-1.05-.2-1.6-.07-.46-.07-.86.08-1.28.54 1.21 2.15 1.65 1.98 3.19-.19 1.69-2.11 2.37-3.39 1.32zM20 20h-2v-1c0-.55-.45-1-1-1h-1.15c.71-.85 1.15-1.89 1.15-3 0-1.89-1.09-2.84-1.85-3.36-1.86-1.27-2.23-2.78-2.25-3.72-.01-.4-.43-.63-.77-.43-5.8 3.43-5.15 7-5.13 7.51.03.96.49 2.07 1.24 3H7c-.55 0-1 .45-1 1v1H4V4h16v16z"})
                                        "FireplaceRounded"))
