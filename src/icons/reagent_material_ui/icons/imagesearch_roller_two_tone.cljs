(ns reagent-material-ui.icons.imagesearch-roller-two-tone
  "Imports @material-ui/icons/ImagesearchRollerTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def imagesearch-roller-two-tone (create-svg-icon [(e "path" #js {"d" "M8 4h10v2H8zm4 13h2v4h-2z", "opacity" ".3"}) (e "path" #js {"d" "M20 7V3c0-.55-.45-1-1-1H7c-.55 0-1 .45-1 1v1H4c-1.1 0-2 .9-2 2v4c0 1.1.9 2 2 2h8v3h-1c-.55 0-1 .45-1 1v6c0 .55.45 1 1 1h4c.55 0 1-.45 1-1v-6c0-.55-.45-1-1-1h-1v-3c0-1.1-.9-2-2-2H4V6h2v1c0 .55.45 1 1 1h12c.55 0 1-.45 1-1zM8 4h10v2H8V4zm6 17h-2v-4h2v4z"})]
                                                  "ImagesearchRollerTwoTone"))
