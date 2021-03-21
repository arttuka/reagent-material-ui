(ns reagent-material-ui.icons.copyright-rounded
  "Imports @material-ui/icons/CopyrightRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def copyright-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm0 18c-4.41 0-8-3.59-8-8s3.59-8 8-8 8 3.59 8 8-3.59 8-8 8z"}) (e "path" #js {"d" "M14 8h-4c-.55 0-1 .45-1 1v6c0 .55.45 1 1 1h4c.55 0 1-.45 1-1v-1c0-.55-.45-1-1-1s-1 .45-1 1h-2v-4h2c0 .55.45 1 1 1s1-.45 1-1V9c0-.55-.45-1-1-1z"}))
                                        "CopyrightRounded"))
