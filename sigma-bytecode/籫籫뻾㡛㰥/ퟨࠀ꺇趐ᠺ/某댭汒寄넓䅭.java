public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u67d0\ub32d\u6c52\u5bc4\ub113\u416d {
    public void \u67d0\ub32d\u6c52\u5bc4\ub113\u416d(\u36d3\u9033\u6b0d\u983f\u8d90.\u5fe1\u8258\u7bad\u960f\u392e\ua6bd p0, org.w3c.dom.Element p1) {
        var_5_D8 : Element
        var_6_118 : NodeList
        var_7_138 : int
        var_8_15D : Element
        var_6_F4 : NodeList
        var_7_FD : int
        var_9_1CA : \ud36e\u527a\u7ce1\u8640\u6ec6\uc87f
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            putfield:\u5fe1\u8258\u7bad\u960f\u392e\ua6bd(\u67d0\ub32d\u6c52\u5bc4\ub113\u416d::\u494c\u99f7\u0c95\u6198\u56bd\u7873, this:\u67d0\ub32d\u6c52\u5bc4\ub113\u416d, p0:\u5fe1\u8258\u7bad\u960f\u392e\ua6bd)
            invokespecial:Object(Object::<init>, this:\u67d0\ub32d\u6c52\u5bc4\ub113\u416d)
            putfield:String(\u67d0\ub32d\u6c52\u5bc4\ub113\u416d::\ub18d\u3dd3\u4492\u4975\u718f\ua6bd, this:\u67d0\ub32d\u6c52\u5bc4\ub113\u416d, invokeinterface:String(Element::getAttribute, p1:Element, loadelement:String(getstatic:String[](\u67d0\ub32d\u6c52\u5bc4\ub113\u416d::\u7049\u983f\u527a\u718f\u3dd3\u527a), and:int(ldc:int(9075), ldc:int(-12148)))))
            putfield:int(\u67d0\ub32d\u6c52\u5bc4\ub113\u416d::\ud158\u8709\ua6bd\ube23\u67e9\u4c04, this:\u67d0\ub32d\u6c52\u5bc4\ub113\u416d, invokestatic:int(Integer::parseInt, invokeinterface:String(Element::getAttribute, p1:Element, loadelement:String(getstatic:String[](\u67d0\ub32d\u6c52\u5bc4\ub113\u416d::\u7049\u983f\u527a\u718f\u3dd3\u527a), and:int(ldc:int(16451), ldc:int(2057))))))
            putfield:int(\u67d0\ub32d\u6c52\u5bc4\ub113\u416d::\u4c2b\u5245\u4bc8\uc9f6\u718f\u965f, this:\u67d0\ub32d\u6c52\u5bc4\ub113\u416d, invokestatic:int(Integer::parseInt, invokeinterface:String(Element::getAttribute, p1:Element, loadelement:String(getstatic:String[](\u67d0\ub32d\u6c52\u5bc4\ub113\u416d::\u7049\u983f\u527a\u718f\u3dd3\u527a), xor:int(ldc:int(20546), ldc:int(20544))))))
            putfield:ArrayList(\u67d0\ub32d\u6c52\u5bc4\ub113\u416d::\ud171\u52d3\u7043\ud51e\u71ae\u7ce1, this:\u67d0\ub32d\u6c52\u5bc4\ub113\u416d, initobject:ArrayList(ArrayList<E>::<init>))
            var_5_D8 = checkcast:Element(org.w3c.dom.Element.class, invokeinterface:Node[expected:Element](NodeList::item, invokeinterface:NodeList(Element::getElementsByTagName, p1:Element, loadelement:String(getstatic:String[](\u67d0\ub32d\u6c52\u5bc4\ub113\u416d::\u7049\u983f\u527a\u718f\u3dd3\u527a), xor:int(ldc:int(10401), ldc:int(10402)))), and:int(ldc:int(-10997), ldc:int(10480))))
            
            if (cmpne:boolean(var_5_D8:Element, aconstnull:Element())) {
                var_6_118 = invokeinterface:NodeList(Element::getElementsByTagName, var_5_D8:Element, loadelement:String(getstatic:String[](\u67d0\ub32d\u6c52\u5bc4\ub113\u416d::\u7049\u983f\u527a\u718f\u3dd3\u527a), xor:int(ldc:int(16939), ldc:int(16943))))
                
                if (cmpne:boolean(var_6_118:NodeList, aconstnull:NodeList())) {
                    putfield:Properties(\u67d0\ub32d\u6c52\u5bc4\ub113\u416d::\ud51e\u7049\u5bc4\u3d4b\u5db4\u647c, this:\u67d0\ub32d\u6c52\u5bc4\ub113\u416d, initobject:Properties(Properties::<init>))
                    var_7_138 = and:int(ldc:int(-26494), ldc:int(26436))
                    
                    while (cmplt:boolean(var_7_138:int, invokeinterface:int(NodeList::getLength, var_6_118:NodeList))) {
                        var_8_15D = checkcast:Element(org.w3c.dom.Element.class, invokeinterface:Node[expected:Element](NodeList::item, var_6_118:NodeList, var_7_138:int))
                        invokevirtual:Object(Properties::setProperty, getfield:Properties(\u67d0\ub32d\u6c52\u5bc4\ub113\u416d::\ud51e\u7049\u5bc4\u3d4b\u5db4\u647c, this:\u67d0\ub32d\u6c52\u5bc4\ub113\u416d), invokeinterface:String(Element::getAttribute, var_8_15D:Element, loadelement:String(getstatic:String[](\u67d0\ub32d\u6c52\u5bc4\ub113\u416d::\u7049\u983f\u527a\u718f\u3dd3\u527a), and:int(ldc:int(14363), ldc:int(-14396)))), invokeinterface:String(Element::getAttribute, var_8_15D:Element, loadelement:String(getstatic:String[](\u67d0\ub32d\u6c52\u5bc4\ub113\u416d::\u7049\u983f\u527a\u718f\u3dd3\u527a), and:int(ldc:int(4133), ldc:int(18839)))))
                        inc:int(var_7_138, ldc:int(1))
                    }
                }
            }
            
            var_6_F4 = invokeinterface:NodeList(Element::getElementsByTagName, p1:Element, loadelement:String(getstatic:String[](\u67d0\ub32d\u6c52\u5bc4\ub113\u416d::\u7049\u983f\u527a\u718f\u3dd3\u527a), xor:int(ldc:int(18706), ldc:int(18708))))
            var_7_FD = and:int(ldc:int(20949), ldc:int(-20950))
            
            while (cmplt:boolean(var_7_FD:int, invokeinterface:int(NodeList::getLength, var_6_F4:NodeList))) {
                var_9_1CA = initobject:\ud36e\u527a\u7ce1\u8640\u6ec6\uc87f(\ud36e\u527a\u7ce1\u8640\u6ec6\uc87f::<init>, p0:\u5fe1\u8258\u7bad\u960f\u392e\ua6bd, checkcast:Element(org.w3c.dom.Element.class, invokeinterface:Node[expected:Element](NodeList::item, var_6_F4:NodeList, var_7_FD:int)))
                putfield:int(\ud36e\u527a\u7ce1\u8640\u6ec6\uc87f::\u8389\u5f50\u92ff\u3dd3\ud12e\u9033, var_9_1CA:\ud36e\u527a\u7ce1\u8640\u6ec6\uc87f, var_7_FD:int)
                invokevirtual:boolean(ArrayList<\ud36e\u527a\u7ce1\u8640\u6ec6\uc87f>::add, getfield:ArrayList(\u67d0\ub32d\u6c52\u5bc4\ub113\u416d::\ud171\u52d3\u7043\ud51e\u71ae\u7ce1, this:\u67d0\ub32d\u6c52\u5bc4\ub113\u416d), var_9_1CA:\ud36e\u527a\u7ce1\u8640\u6ec6\uc87f)
                inc:int(var_7_FD, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_283 : int
        expr_6B : int [generated]
        stack_A4_0 : byte[] [generated]
        stack_A6_0 : byte[] [generated]
        stack_CF_0 : byte[] [generated]
        stack_D1_0 : byte[] [generated]
        stack_FA_0 : byte[] [generated]
        stack_FC_0 : byte[] [generated]
        stack_136_0 : byte[] [generated]
        stack_242_0 : byte[] [generated]
        stack_295_0 : byte[] [generated]
        stack_31B_0 : byte[] [generated]
        stack_36E_0 : byte[] [generated]
        var_4_21E : int
        var_3_223 : byte[]
        var_5_224 : int
        var_0_28B : int
        expr_295 : byte [generated]
        stack_2D1_2 : byte [generated]
        stack_2B0_0 : byte [generated]
        expr_31E : byte [generated]
        expr_A6 : int [generated]
        expr_D1 : int [generated]
        var_2_FA : byte[]
        expr_FE : int [generated]
        var_3_35D : byte[]
        var_5_35E : int
        var_3_142 : String
        stack_217_0 : String[] [generated]
        expr_154 : String[] [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_0_283 = and:int(ldc:int(-853114616), ldc:int(-314052516))
        expr_6B = arraylength:int(stack_A4_0 = stack_A6_0 = stack_CF_0 = stack_D1_0 = stack_FA_0 = stack_FC_0 = stack_136_0 = stack_242_0 = stack_295_0 = stack_31B_0 = stack_36E_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("ib2JcYVBgYFxgU3NlaWxbU2BnVGBfXGdoYVBgZ2RwUFZbT3JdUG5SdD2uuqL")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_21E = expr_6B:int
        var_3_223 = newarray:byte[](byte.class, expr_6B:int)
        var_5_224 = expr_6B:int
        Label_0550:
        
        while (cmpne:boolean(and:int(var_0_283:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_283:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0625)
            }
            
            var_0_283 = and:int(var_0_283:int, ldc:int(-272640385))
            var_5_224 = add:int(var_5_224:int, ldc:int(-1))
            storeelement:byte(var_3_223:byte[], var_5_224:int, xor:byte(loadelement:byte(stack_242_0:byte[], var_5_224:int), ldc:byte(125)))
            
            if (cmpne:boolean(var_5_224:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_CF_0 = stack_D1_0 = stack_FA_0 = stack_FC_0 = stack_136_0 = stack_242_0 = stack_295_0 = stack_31B_0 = stack_36E_0 = var_3_223:byte[]
            goto(Label_0112)
        }
        
        goto(Label_0759)
        Label_0625:
        
        while (cmpne:boolean(and:int(var_0_283:int, ldc:int(131072)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_283:int, ldc:int(16)), ldc:int(0))) {
                var_0_283 = and:int(var_0_283:int, ldc:int(923037431))
                goto(Label_0550)
            }
            
            var_0_28B = and:int(var_0_283:int, ldc:int(-1313397))
            var_5_224 = add:int(var_5_224:int, ldc:int(-1))
            expr_295 = stack_2D1_2 = loadelement(stack_295_0, var_5_224)
            
            if (cmplt:boolean(add:int(add:int(var_5_224:int, ldc:int(4)), neg:int(var_4_21E:int)), ldc:int(0))) {
                stack_2D1_2 = stack_2B0_0 = add:byte(expr_295:byte, loadelement:byte(var_3_223:byte[], add:int(var_5_224:int, ldc:int(4))))
                goto(Label_0704)
            }
            
            Label_0674:
            
            if (cmpeq:boolean(and:int(var_0_28B:int, ldc:int(16384)), ldc:int(0))) {
                var_0_28B = and:int(var_0_28B:int, ldc:int(-9204358))
                stack_2D1_2 = stack_2B0_0 = add:byte(expr_295:byte, ldc:byte(4))
            }
            
            Label_0704:
            
            if (cmpne:boolean(and:int(var_0_28B:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_0674)
            }
            
            var_0_283 = and:int(var_0_28B:int, ldc:int(-315179287))
            storeelement:byte(var_3_223:byte[], var_5_224:int, stack_2D1_2:byte)
            
            if (cmpne:boolean(var_5_224:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_CF_0 = stack_D1_0 = stack_FA_0 = stack_FC_0 = stack_136_0 = stack_242_0 = stack_295_0 = stack_31B_0 = stack_36E_0 = var_3_223:byte[]
            goto(Label_0171)
        }
        
        Label_0759:
        
        while (cmpne:boolean(and:int(var_0_283:int, ldc:int(134217728)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_283:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0550)
            }
            
            var_0_283 = and:int(var_0_283:int, ldc:int(-548998291))
            var_5_224 = add:int(var_5_224:int, ldc:int(-1))
            expr_31E = add:byte(loadelement:byte(stack_31B_0:byte[], var_5_224:int), ldc:byte(6))
            storeelement:byte(var_3_223:byte[], var_5_224:int, or:int(and:int(shl:int(expr_31E:byte, and:int(ldc:int(2564), ldc:int(25613))), ldc:int(-16)), and:int(shr:int(expr_31E:byte[expected:int], xor:int(ldc:int(16514), ldc:int(16518))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_224:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_CF_0 = stack_D1_0 = stack_FA_0 = stack_FC_0 = stack_136_0 = stack_242_0 = stack_295_0 = stack_31B_0 = stack_36E_0 = var_3_223:byte[]
            goto(Label_0214)
        }
        
        var_0_283 = and:int(var_0_283:int, ldc:int(1860045229))
        goto(Label_0625)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_283:int, ldc:int(8192)), ldc:int(0))) {
            var_0_283 = and:int(var_0_283:int, ldc:int(45583104))
            goto(Label_0259)
        }
        
        if (cmpne:boolean(and:int(var_0_283:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_283 = and:int(var_0_283:int, ldc:int(20804580))
            goto(Label_0214)
        }
        
        if (cmpne:boolean(and:int(var_0_283:int, ldc:int(512)), ldc:int(0))) {
            var_0_283 = and:int(var_0_283:int, ldc:int(-301636785))
        }
        else {
            var_0_283 = and:int(var_0_283:int, ldc:int(-10830836))
            expr_A6 = arraylength:int(stack_A6_0:byte[])
            
            if (cmpne:boolean(expr_A6:int, ldc:int(0))) {
                var_4_21E = expr_A6:int
                var_3_223 = newarray:byte[](byte.class, expr_A6:int)
                var_5_224 = expr_A6:int
                goto(Label_0625)
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_0_283:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_0259)
        }
        
        if (cmpeq:boolean(and:int(var_0_283:int, ldc:int(512)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_283:int, ldc:int(8)), ldc:int(0))) {
                var_0_283 = and:int(var_0_283:int, ldc:int(2052136124))
                goto(Label_0112)
            }
            
            var_0_283 = and:int(var_0_283:int, ldc:int(-6314614))
            expr_D1 = arraylength:int(stack_D1_0:byte[])
            
            if (cmpne:boolean(expr_D1:int, ldc:int(0))) {
                var_4_21E = expr_D1:int
                var_3_223 = newarray:byte[](byte.class, expr_D1:int)
                var_5_224 = expr_D1:int
                goto(Label_0759)
            }
        }
        
        Label_0214:
        
        if (cmpeq:boolean(and:int(var_0_283:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_283 = and:int(var_0_283:int, ldc:int(338582381))
        }
        else {
            if (cmpne:boolean(and:int(var_0_283:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0171)
            }
            
            if (cmpeq:boolean(and:int(var_0_283:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_283 = and:int(var_0_283:int, ldc:int(-548683650))
            var_2_FA = stack_FA_0:byte[]
            expr_FE = add:int(arraylength:int(stack_FC_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_FE:int, ldc:int(0))) {
                var_3_35D = newarray:byte[](byte.class, expr_FE:int)
                var_5_35E = expr_FE:int
                
                loop {
                    var_0_283 = and:int(var_0_283:int, ldc:int(-268507633))
                    var_5_35E = add:int(var_5_35E:int, ldc:int(-1))
                    storeelement:byte(var_3_35D:byte[], var_5_35E:int, add:int(shl:int(loadelement:byte(stack_36E_0:byte[], var_5_35E:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_FA:byte[], add:int(var_5_35E:int, xor:int(ldc:int(456), ldc:int(457)))), ldc:int(6)), xor:int(ldc:int(3333), ldc:int(3334)))))
                    
                    if (cmpne:boolean(var_5_35E:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A6_0 = stack_A4_0 = stack_CF_0 = stack_D1_0 = stack_FA_0 = stack_FC_0 = stack_136_0 = stack_242_0 = stack_295_0 = stack_31B_0 = stack_36E_0 = var_3_35D:byte[]
            }
        }
        
        Label_0259:
        
        if (cmpeq:boolean(and:int(var_0_283:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_283 = and:int(var_0_283:int, ldc:int(1275032365))
            goto(Label_0214)
        }
        
        if (cmpeq:boolean(and:int(var_0_283:int, ldc:int(32768)), ldc:int(0))) {
            var_0_283 = and:int(var_0_283:int, ldc:int(-1942596040))
            goto(Label_0171)
        }
        
        if (cmpeq:boolean(and:int(var_0_283:int, ldc:int(32768)), ldc:int(0))) {
            var_0_283 = and:int(var_0_283:int, ldc:int(1515591988))
            goto(Label_0112)
        }
        
        var_3_142 = initobject:String(String::<init>, stack_136_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_217_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(8354), ldc:int(8357)))
        expr_154 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(37), ldc:int(34)))
        storeelement:String(expr_154:String[], and:int(ldc:int(3651), ldc:int(10)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(28965), ldc:int(-28966)), and:int(ldc:int(12902), ldc:int(16390))))
        storeelement:String(expr_154:String[], and:int(ldc:int(-928), ldc:int(925)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(18974), ldc:int(1414)), and:int(ldc:int(24986), ldc:int(1034))))
        storeelement:String(expr_154:String[], and:int(ldc:int(1206), ldc:int(26950)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(2395), ldc:int(9742)), and:int(ldc:int(24592), ldc:int(4091))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(2058), ldc:int(2057)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(-12282), ldc:int(-12266)), and:int(ldc:int(94), ldc:int(2586))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(534), ldc:int(530)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(8862), ldc:int(1306)), and:int(ldc:int(24883), ldc:int(3106))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(6145), ldc:int(6148)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(16419), ldc:int(8230)), xor:int(ldc:int(16743), ldc:int(16704))))
        storeelement:String(expr_154:String[], and:int(ldc:int(17105), ldc:int(3087)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(167), ldc:int(128)), xor:int(ldc:int(1120), ldc:int(1100))))
        putstatic:String[](\u67d0\ub32d\u6c52\u5bc4\ub113\u416d::\u7049\u983f\u527a\u718f\u3dd3\u527a, expr_154:String[])
    }
    
    public void \u5fe1\ud12e\uc246\u6ec6\u7006\u6c56(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_638 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_643 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_3_638 = and:int(ldc:int(-1150240069), ldc:int(-1641743425))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u67d0\ub32d\u6c52\u5bc4\ub113\u416d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(65536)), ldc:int(0))) {
            var_3_638 = and:int(var_3_638:int, ldc:int(-72287525))
            var_5_7D = and:int(ldc:int(15056), ldc:int(-15068))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-28457), ldc:int(27176)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_638:int, ldc:int(1584921531))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(2433), ldc:int(513)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(320), ldc:int(321)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_638 = and:int(var_3_CA:int, ldc:int(1064623358))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(40), ldc:int(41)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-386093420))
                        goto(Label_1467)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(570878644))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1087)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-2120169994))
                        goto(Label_0916)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-1347714302))
                        goto(Label_0816)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0683)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(2066503950))
                    }
                    else {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-1154746177))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0816)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(8)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(820282890))
                        goto(Label_1467)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(182465071))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(8)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-292564926))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1087)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-1990264697))
                        goto(Label_0916)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0816)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-657406247))
                        goto(Label_0683)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-821475179))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(1093746185))
                            loopcontinue()
                        }
                        
                        var_3_638 = and:int(var_3_638:int, ldc:int(439024571))
                        var_11_DB = and:int(ldc:int(-25861), ldc:int(25860))
                        goto(Label_1456)
                    }
                    
                    Label_0565:
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-2029384087))
                        goto(Label_1467)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1087)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0916)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(8)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(1035665657))
                        goto(Label_0816)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(-2023451834))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(-1313501473))
                            loopcontinue()
                        }
                        
                        var_3_638 = and:int(var_3_638:int, ldc:int(2061548735))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0816)
                        }
                    }
                    
                    Label_0683:
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1467)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(8)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(1148204507))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-488709406))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1087)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(1577768268))
                        goto(Label_0916)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-739768719))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(-757698407))
                            loopcontinue()
                        }
                        
                        var_3_638 = and:int(var_3_638:int, ldc:int(-30230117))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0816:
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1467)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1087)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(16)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-860992159))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(461339279))
                            goto(Label_0683)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_638 = and:int(var_3_638:int, ldc:int(-538248710))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(209), ldc:int(30991))
                                goto(Label_1087)
                            }
                        }
                    }
                    
                    Label_0916:
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(128)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(1532206861))
                        goto(Label_1467)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(1666577335))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(1506242099))
                            goto(Label_0816)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(1711785300))
                            goto(Label_0683)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(1465619523))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(-2064131646))
                            loopcontinue()
                        }
                        
                        var_3_638 = and:int(var_3_638:int, ldc:int(-1631676162))
                        var_11_DB = and:int(ldc:int(-12933), ldc:int(12932))
                    }
                    
                    Label_1087:
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1467)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0916)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0816)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0683)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(-1667578009))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(43969131))
                            loopcontinue()
                        }
                        
                        var_3_638 = and:int(var_3_638:int, ldc:int(-630596613))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1316)
                            }
                        }
                    }
                    
                    Label_1186:
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(16)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-276337109))
                        goto(Label_1467)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_1087)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0916)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(128)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(2094863544))
                            goto(Label_0816)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(128)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(-787380186))
                            goto(Label_0683)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(-128366392))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(16)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(-30237249))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1456)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1316:
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1467)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-1988618488))
                        goto(Label_1087)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0916)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(128)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-1164254609))
                        goto(Label_0816)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-430214087))
                        goto(Label_0683)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-1834382920))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-791515763))
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2097152)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_638 = and:int(var_3_638:int, ldc:int(518847742))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1456:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_643 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1467:
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-1530320421))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(528785764))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1087)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0916)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(942606953))
                        goto(Label_0816)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-2085399189))
                        goto(Label_0683)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(2119577717))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(1592524478))
                        var_17_643 = add:int(var_16_109:int, xor:int(ldc:int(28676), ldc:int(28677)))
                        looporswitchbreak()
                    }
                    
                    var_3_638 = and:int(var_3_638:int, ldc:int(-1978735042))
                }
                
                var_3_638 = and:int(var_3_638:int, ldc:int(2079103998))
                
                if (cmple:boolean(var_5_7D = var_17_643:int, sub:int(var_6_84:int, xor:int(ldc:int(13376), ldc:int(13377))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(4096)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
