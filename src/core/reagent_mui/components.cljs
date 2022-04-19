(ns reagent-mui.components
  "Imports all components from @mui/material as Reagent components.
   Importing components from their own namespaces is preferred due to bundle size.
   Requiring this namespace causes the whole @mui/material package to be included in the final bundle.
   Original documentation is at https://mui.com/material/api/ ."
  (:refer-clojure :exclude [list])
  (:require reagent-mui.material.accordion
            reagent-mui.material.accordion-actions
            reagent-mui.material.accordion-details
            reagent-mui.material.accordion-summary
            reagent-mui.material.alert
            reagent-mui.material.alert-title
            reagent-mui.material.app-bar
            reagent-mui.material.autocomplete
            reagent-mui.material.create-filter-options
            reagent-mui.material.avatar
            reagent-mui.material.avatar-group
            reagent-mui.material.backdrop
            reagent-mui.material.badge
            reagent-mui.material.bottom-navigation
            reagent-mui.material.bottom-navigation-action
            reagent-mui.material.box
            reagent-mui.material.breadcrumbs
            reagent-mui.material.button
            reagent-mui.material.button-base
            reagent-mui.material.button-group
            reagent-mui.material.card
            reagent-mui.material.card-action-area
            reagent-mui.material.card-actions
            reagent-mui.material.card-content
            reagent-mui.material.card-header
            reagent-mui.material.card-media
            reagent-mui.material.checkbox
            reagent-mui.material.chip
            reagent-mui.material.circular-progress
            reagent-mui.material.click-away-listener
            reagent-mui.material.collapse
            reagent-mui.material.container
            reagent-mui.material.css-baseline
            reagent-mui.material.dialog
            reagent-mui.material.dialog-actions
            reagent-mui.material.dialog-content
            reagent-mui.material.dialog-content-text
            reagent-mui.material.dialog-title
            reagent-mui.material.divider
            reagent-mui.material.drawer
            reagent-mui.material.fab
            reagent-mui.material.fade
            reagent-mui.material.filled-input
            reagent-mui.material.form-control
            reagent-mui.material.use-form-control
            reagent-mui.material.form-control-label
            reagent-mui.material.form-group
            reagent-mui.material.form-helper-text
            reagent-mui.material.form-label
            reagent-mui.material.global-styles
            reagent-mui.material.grid
            reagent-mui.material.grow
            reagent-mui.material.hidden
            reagent-mui.material.icon
            reagent-mui.material.icon-button
            reagent-mui.material.image-list
            reagent-mui.material.image-list-item
            reagent-mui.material.image-list-item-bar
            reagent-mui.material.input
            reagent-mui.material.input-adornment
            reagent-mui.material.input-base
            reagent-mui.material.input-label
            reagent-mui.material.linear-progress
            reagent-mui.material.link
            reagent-mui.material.list
            reagent-mui.material.list-item
            reagent-mui.material.list-item-avatar
            reagent-mui.material.list-item-button
            reagent-mui.material.list-item-icon
            reagent-mui.material.list-item-secondary-action
            reagent-mui.material.list-item-text
            reagent-mui.material.list-subheader
            reagent-mui.material.menu
            reagent-mui.material.menu-item
            reagent-mui.material.menu-list
            reagent-mui.material.mobile-stepper
            reagent-mui.material.modal
            reagent-mui.material.modal-manager
            reagent-mui.material.native-select
            reagent-mui.material.no-ssr
            reagent-mui.material.outlined-input
            reagent-mui.material.pagination
            reagent-mui.material.pagination-item
            reagent-mui.material.paper
            reagent-mui.material.popover
            reagent-mui.material.popper
            reagent-mui.material.portal
            reagent-mui.material.radio
            reagent-mui.material.radio-group
            reagent-mui.material.use-radio-group
            reagent-mui.material.rating
            reagent-mui.material.scoped-css-baseline
            reagent-mui.material.select
            reagent-mui.material.skeleton
            reagent-mui.material.slide
            reagent-mui.material.slider
            reagent-mui.material.snackbar
            reagent-mui.material.snackbar-content
            reagent-mui.material.speed-dial
            reagent-mui.material.speed-dial-action
            reagent-mui.material.speed-dial-icon
            reagent-mui.material.stack
            reagent-mui.material.step
            reagent-mui.material.step-button
            reagent-mui.material.step-connector
            reagent-mui.material.step-content
            reagent-mui.material.step-icon
            reagent-mui.material.step-label
            reagent-mui.material.stepper
            reagent-mui.material.styled-engine-provider
            reagent-mui.material.svg-icon
            reagent-mui.material.swipeable-drawer
            reagent-mui.material.switch-component
            reagent-mui.material.tab
            reagent-mui.material.tab-scroll-button
            reagent-mui.material.table
            reagent-mui.material.table-body
            reagent-mui.material.table-cell
            reagent-mui.material.table-container
            reagent-mui.material.table-footer
            reagent-mui.material.table-head
            reagent-mui.material.table-pagination
            reagent-mui.material.table-row
            reagent-mui.material.table-sort-label
            reagent-mui.material.tabs
            reagent-mui.material.text-field
            reagent-mui.material.textarea-autosize
            reagent-mui.material.toggle-button
            reagent-mui.material.toggle-button-group
            reagent-mui.material.toolbar
            reagent-mui.material.tooltip
            reagent-mui.material.typography
            reagent-mui.material.unstable-trap-focus
            reagent-mui.material.zoom
            reagent-mui.material.use-autocomplete
            reagent-mui.material.use-media-query
            reagent-mui.material.use-pagination
            reagent-mui.material.use-scroll-trigger
            reagent-mui.material.use-touch-ripple))

(def accordion reagent-mui.material.accordion/accordion)
(def accordion-actions reagent-mui.material.accordion-actions/accordion-actions)
(def accordion-details reagent-mui.material.accordion-details/accordion-details)
(def accordion-summary reagent-mui.material.accordion-summary/accordion-summary)
(def alert reagent-mui.material.alert/alert)
(def alert-title reagent-mui.material.alert-title/alert-title)
(def app-bar reagent-mui.material.app-bar/app-bar)
(def autocomplete reagent-mui.material.autocomplete/autocomplete)
(def create-filter-options reagent-mui.material.create-filter-options/create-filter-options)
(def avatar reagent-mui.material.avatar/avatar)
(def avatar-group reagent-mui.material.avatar-group/avatar-group)
(def backdrop reagent-mui.material.backdrop/backdrop)
(def badge reagent-mui.material.badge/badge)
(def bottom-navigation reagent-mui.material.bottom-navigation/bottom-navigation)
(def bottom-navigation-action reagent-mui.material.bottom-navigation-action/bottom-navigation-action)
(def box reagent-mui.material.box/box)
(def breadcrumbs reagent-mui.material.breadcrumbs/breadcrumbs)
(def button reagent-mui.material.button/button)
(def button-base reagent-mui.material.button-base/button-base)
(def button-group reagent-mui.material.button-group/button-group)
(def card reagent-mui.material.card/card)
(def card-action-area reagent-mui.material.card-action-area/card-action-area)
(def card-actions reagent-mui.material.card-actions/card-actions)
(def card-content reagent-mui.material.card-content/card-content)
(def card-header reagent-mui.material.card-header/card-header)
(def card-media reagent-mui.material.card-media/card-media)
(def checkbox reagent-mui.material.checkbox/checkbox)
(def chip reagent-mui.material.chip/chip)
(def circular-progress reagent-mui.material.circular-progress/circular-progress)
(def click-away-listener reagent-mui.material.click-away-listener/click-away-listener)
(def collapse reagent-mui.material.collapse/collapse)
(def container reagent-mui.material.container/container)
(def css-baseline reagent-mui.material.css-baseline/css-baseline)
(def dialog reagent-mui.material.dialog/dialog)
(def dialog-actions reagent-mui.material.dialog-actions/dialog-actions)
(def dialog-content reagent-mui.material.dialog-content/dialog-content)
(def dialog-content-text reagent-mui.material.dialog-content-text/dialog-content-text)
(def dialog-title reagent-mui.material.dialog-title/dialog-title)
(def divider reagent-mui.material.divider/divider)
(def drawer reagent-mui.material.drawer/drawer)
(def fab reagent-mui.material.fab/fab)
(def fade reagent-mui.material.fade/fade)
(def filled-input reagent-mui.material.filled-input/filled-input)
(def form-control reagent-mui.material.form-control/form-control)
(def use-form-control reagent-mui.material.use-form-control/use-form-control)
(def form-control-label reagent-mui.material.form-control-label/form-control-label)
(def form-group reagent-mui.material.form-group/form-group)
(def form-helper-text reagent-mui.material.form-helper-text/form-helper-text)
(def form-label reagent-mui.material.form-label/form-label)
(def global-styles reagent-mui.material.global-styles/global-styles)
(def grid reagent-mui.material.grid/grid)
(def grow reagent-mui.material.grow/grow)
(def hidden reagent-mui.material.hidden/hidden)
(def icon reagent-mui.material.icon/icon)
(def icon-button reagent-mui.material.icon-button/icon-button)
(def image-list reagent-mui.material.image-list/image-list)
(def image-list-item reagent-mui.material.image-list-item/image-list-item)
(def image-list-item-bar reagent-mui.material.image-list-item-bar/image-list-item-bar)
(def input reagent-mui.material.input/input)
(def input-adornment reagent-mui.material.input-adornment/input-adornment)
(def input-base reagent-mui.material.input-base/input-base)
(def input-label reagent-mui.material.input-label/input-label)
(def linear-progress reagent-mui.material.linear-progress/linear-progress)
(def link reagent-mui.material.link/link)
(def list reagent-mui.material.list/list)
(def list-item reagent-mui.material.list-item/list-item)
(def list-item-avatar reagent-mui.material.list-item-avatar/list-item-avatar)
(def list-item-button reagent-mui.material.list-item-button/list-item-button)
(def list-item-icon reagent-mui.material.list-item-icon/list-item-icon)
(def list-item-secondary-action reagent-mui.material.list-item-secondary-action/list-item-secondary-action)
(def list-item-text reagent-mui.material.list-item-text/list-item-text)
(def list-subheader reagent-mui.material.list-subheader/list-subheader)
(def menu reagent-mui.material.menu/menu)
(def menu-item reagent-mui.material.menu-item/menu-item)
(def menu-list reagent-mui.material.menu-list/menu-list)
(def mobile-stepper reagent-mui.material.mobile-stepper/mobile-stepper)
(def modal reagent-mui.material.modal/modal)
(def modal-manager reagent-mui.material.modal-manager/modal-manager)
(def native-select reagent-mui.material.native-select/native-select)
(def no-ssr reagent-mui.material.no-ssr/no-ssr)
(def outlined-input reagent-mui.material.outlined-input/outlined-input)
(def pagination reagent-mui.material.pagination/pagination)
(def pagination-item reagent-mui.material.pagination-item/pagination-item)
(def paper reagent-mui.material.paper/paper)
(def popover reagent-mui.material.popover/popover)
(def popper reagent-mui.material.popper/popper)
(def portal reagent-mui.material.portal/portal)
(def radio reagent-mui.material.radio/radio)
(def radio-group reagent-mui.material.radio-group/radio-group)
(def use-radio-group reagent-mui.material.use-radio-group/use-radio-group)
(def rating reagent-mui.material.rating/rating)
(def scoped-css-baseline reagent-mui.material.scoped-css-baseline/scoped-css-baseline)
(def select reagent-mui.material.select/select)
(def skeleton reagent-mui.material.skeleton/skeleton)
(def slide reagent-mui.material.slide/slide)
(def slider reagent-mui.material.slider/slider)
(def snackbar reagent-mui.material.snackbar/snackbar)
(def snackbar-content reagent-mui.material.snackbar-content/snackbar-content)
(def speed-dial reagent-mui.material.speed-dial/speed-dial)
(def speed-dial-action reagent-mui.material.speed-dial-action/speed-dial-action)
(def speed-dial-icon reagent-mui.material.speed-dial-icon/speed-dial-icon)
(def stack reagent-mui.material.stack/stack)
(def step reagent-mui.material.step/step)
(def step-button reagent-mui.material.step-button/step-button)
(def step-connector reagent-mui.material.step-connector/step-connector)
(def step-content reagent-mui.material.step-content/step-content)
(def step-icon reagent-mui.material.step-icon/step-icon)
(def step-label reagent-mui.material.step-label/step-label)
(def stepper reagent-mui.material.stepper/stepper)
(def styled-engine-provider reagent-mui.material.styled-engine-provider/styled-engine-provider)
(def svg-icon reagent-mui.material.svg-icon/svg-icon)
(def swipeable-drawer reagent-mui.material.swipeable-drawer/swipeable-drawer)
(def switch reagent-mui.material.switch-component/switch)
(def tab reagent-mui.material.tab/tab)
(def tab-scroll-button reagent-mui.material.tab-scroll-button/tab-scroll-button)
(def table reagent-mui.material.table/table)
(def table-body reagent-mui.material.table-body/table-body)
(def table-cell reagent-mui.material.table-cell/table-cell)
(def table-container reagent-mui.material.table-container/table-container)
(def table-footer reagent-mui.material.table-footer/table-footer)
(def table-head reagent-mui.material.table-head/table-head)
(def table-pagination reagent-mui.material.table-pagination/table-pagination)
(def table-row reagent-mui.material.table-row/table-row)
(def table-sort-label reagent-mui.material.table-sort-label/table-sort-label)
(def tabs reagent-mui.material.tabs/tabs)
(def text-field reagent-mui.material.text-field/text-field)
(def textarea-autosize reagent-mui.material.textarea-autosize/textarea-autosize)
(def toggle-button reagent-mui.material.toggle-button/toggle-button)
(def toggle-button-group reagent-mui.material.toggle-button-group/toggle-button-group)
(def toolbar reagent-mui.material.toolbar/toolbar)
(def tooltip reagent-mui.material.tooltip/tooltip)
(def typography reagent-mui.material.typography/typography)
(def unstable-trap-focus reagent-mui.material.unstable-trap-focus/unstable-trap-focus)
(def zoom reagent-mui.material.zoom/zoom)
(def use-autocomplete reagent-mui.material.use-autocomplete/use-autocomplete)
(def use-media-query reagent-mui.material.use-media-query/use-media-query)
(def use-pagination reagent-mui.material.use-pagination/use-pagination)
(def use-scroll-trigger reagent-mui.material.use-scroll-trigger/use-scroll-trigger)
(def use-touch-ripple reagent-mui.material.use-touch-ripple/use-touch-ripple)
