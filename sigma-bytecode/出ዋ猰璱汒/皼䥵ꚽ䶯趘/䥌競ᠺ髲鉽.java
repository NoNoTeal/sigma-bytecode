public class \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u494c\u7af6\u183a\u9af2\u927d {
    public void \u494c\u7af6\u183a\u9af2\u927d(\u5d20\u97b7\u8753\u873d\u16f6.\u36d3\u4975\uae87\u873d\u6d69 p0) {
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
            invokespecial:Object(Object::<init>, this:\u494c\u7af6\u183a\u9af2\u927d)
            putfield:\u36d3\u4975\uae87\u873d\u6d69(\u494c\u7af6\u183a\u9af2\u927d::\u76bc\u3d4b\u12b2\u3776\u183a\u416d, this:\u494c\u7af6\u183a\u9af2\u927d, p0:\u36d3\u4975\uae87\u873d\u6d69)
            putfield:List<byte[]>(\u494c\u7af6\u183a\u9af2\u927d::\u1833\ube23\u836c\u8389\u516c\u9033, this:\u494c\u7af6\u183a\u9af2\u927d, initobject:ArrayList<byte[]>[expected:List<byte[]>](ArrayList<E>::<init>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u5d20\u97b7\u8753\u873d\u16f6.\u36d3\u4975\uae87\u873d\u6d69 \u98a4\u3bc9\u6bb9\u836c\ua61f\u3504(byte[] p0) {
        var_4_A8 : \u36d3\u4975\uae87\u873d\u6d69
        
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
        invokeinterface:boolean(List<byte[]>::add, getfield:List<byte[]>(\u494c\u7af6\u183a\u9af2\u927d::\u1833\ube23\u836c\u8389\u516c\u9033, this:\u494c\u7af6\u183a\u9af2\u927d), p0:byte[])
        
        if (cmpne:boolean(invokeinterface:int(List<E>::size, getfield:List<byte[]>(\u494c\u7af6\u183a\u9af2\u927d::\u1833\ube23\u836c\u8389\u516c\u9033, this:\u494c\u7af6\u183a\u9af2\u927d)), getfield:int(\u36d3\u4975\uae87\u873d\u6d69::\u62da\u5f50\u7330\u4492\u51fa\u6d69, getfield:\u36d3\u4975\uae87\u873d\u6d69(\u494c\u7af6\u183a\u9af2\u927d::\u76bc\u3d4b\u12b2\u3776\u183a\u416d, this:\u494c\u7af6\u183a\u9af2\u927d)))) {
            return:\u36d3\u4975\uae87\u873d\u6d69(aconstnull:\u36d3\u4975\uae87\u873d\u6d69())
        }
        
        var_4_A8 = invokestatic:\u36d3\u4975\uae87\u873d\u6d69(\u74b1\u69d9\u7e3f\ua3b4\u88c5::\u7006\u67e9\u3776\u6fb0\u71f1\uc2bd, getfield:\u36d3\u4975\uae87\u873d\u6d69(\u494c\u7af6\u183a\u9af2\u927d::\u76bc\u3d4b\u12b2\u3776\u183a\u416d, this:\u494c\u7af6\u183a\u9af2\u927d), checkcast:byte[][](byte[][].class, invokeinterface:byte[][](List<byte[]>::toArray, getfield:List<byte[]>(\u494c\u7af6\u183a\u9af2\u927d::\u1833\ube23\u836c\u8389\u516c\u9033, this:\u494c\u7af6\u183a\u9af2\u927d), newarray:byte[][](byte[].class, invokeinterface:int(List<E>::size, getfield:List<byte[]>(\u494c\u7af6\u183a\u9af2\u927d::\u1833\ube23\u836c\u8389\u516c\u9033, this:\u494c\u7af6\u183a\u9af2\u927d))))))
        invokevirtual:void(\u494c\u7af6\u183a\u9af2\u927d::\uc29a\ucb79\u4daf\u8bb0\u8aa5\u1833, this:\u494c\u7af6\u183a\u9af2\u927d)
        return:\u36d3\u4975\uae87\u873d\u6d69(var_4_A8:\u36d3\u4975\uae87\u873d\u6d69)
    }
    
    public void \uc29a\ucb79\u4daf\u8bb0\u8aa5\u1833() {
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
            putfield:\u36d3\u4975\uae87\u873d\u6d69(\u494c\u7af6\u183a\u9af2\u927d::\u76bc\u3d4b\u12b2\u3776\u183a\u416d, this:\u494c\u7af6\u183a\u9af2\u927d, aconstnull:\u36d3\u4975\uae87\u873d\u6d69())
            putfield:List<byte[]>(\u494c\u7af6\u183a\u9af2\u927d::\u1833\ube23\u836c\u8389\u516c\u9033, this:\u494c\u7af6\u183a\u9af2\u927d, initobject:ArrayList<byte[]>[expected:List<byte[]>](ArrayList<E>::<init>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4ab3\u8aa5\u97b7\u1833\u527a\u7c6b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_61D : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_628 : int
        
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
        var_3_61D = and:int(ldc:int(1645235297), ldc:int(1649797605))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u494c\u7af6\u183a\u9af2\u927d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_61D = and:int(var_3_61D:int, ldc:int(45986023))
        }
        else {
            var_3_61D = and:int(var_3_61D:int, ldc:int(-69546777))
            var_5_85 = and:int(ldc:int(-32267), ldc:int(30218))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-15236), ldc:int(7043)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_61D:int, ldc:int(1620179065))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(17409), ldc:int(4161)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(4229), ldc:int(4228)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_61D = and:int(var_3_DA:int, ldc:int(-241771165))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(8320), ldc:int(8321)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-449918853))
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-489090761))
                        goto(Label_1099)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1926173755))
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(395361412))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1318744975))
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1004702348))
                        goto(Label_0581)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(567821859))
                    }
                    else {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1983902703))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0581)
                            }
                            
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0421:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-289835664))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1446440658))
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1099)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1505795612))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1713454852))
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(32)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1369124207))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1943956599))
                        var_11_EB = and:int(ldc:int(10552), ldc:int(-10555))
                        goto(Label_1439)
                    }
                    
                    Label_0581:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1391235362))
                        goto(Label_1099)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(574424961))
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(2076494276))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(982153595))
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-321595911))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0692:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1585860769))
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1430361045))
                        goto(Label_1099)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-2068439031))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1318589747))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-455354377))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0810:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-876589565))
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1444692809))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(2125017925))
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1400486391))
                        goto(Label_1099)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1841235456))
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(416598191))
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1687476983))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(16899), ldc:int(16898))
                                goto(Label_1099)
                            }
                        }
                    }
                    
                    Label_0937:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-700383677))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-764728035))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1547014310))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1458861142))
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1078215540))
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(256)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(313651187))
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-510562319))
                        var_11_EB = and:int(ldc:int(10000), ldc:int(-12049))
                    }
                    
                    Label_1099:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1821167331))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-910689885))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0937)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(256)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-262015573))
                            goto(Label_0692)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1811466485))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1316)
                            }
                        }
                    }
                    
                    Label_1202:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-9319152))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(256)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-87158930))
                            goto(Label_1099)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0937)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(32)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(322644617))
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1904073841))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1439)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1316:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-175440840))
                        goto(Label_1099)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1634695190))
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-708002799))
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0581)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1032326906))
                        goto(Label_0421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_61D = and:int(var_3_61D:int, ldc:int(1834608621))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1439:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_628 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1450:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1603369648))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-285782207))
                        goto(Label_1099)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(405250957))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1716403377))
                        goto(Label_0581)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1444986544))
                        goto(Label_0421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-103562631))
                        var_17_628 = add:int(var_16_119:int, xor:int(ldc:int(1026), ldc:int(1027)))
                        looporswitchbreak()
                    }
                    
                    var_3_61D = and:int(var_3_61D:int, ldc:int(-1837954732))
                }
                
                var_3_61D = and:int(var_3_61D:int, ldc:int(-42742297))
                
                if (cmple:boolean(var_5_85 = var_17_628:int, sub:int(var_6_8C:int, and:int(ldc:int(2065), ldc:int(16937))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(32768)), ldc:int(0))) {
            var_3_61D = and:int(var_3_61D:int, ldc:int(1873692454))
            goto(Label_0106)
        }
    }
}
