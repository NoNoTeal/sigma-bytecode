public class \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u7049\ub70c\u392e\u93a2\ud12e\u8df4 {
    public void \u7049\ub70c\u392e\u93a2\ud12e\u8df4() {
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
            invokespecial:Object(Object::<init>, this:\u7049\ub70c\u392e\u93a2\ud12e\u8df4)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static int \u6d69\ube23\u6b0d\u98a4\uc31c\u8aa5(int p0, int p1, \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u5bc4\u385b\ubefe\u8cae\u97b7\u385b p2) {
        var_5_68 : int
        var_6_72 : int
        
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
        var_5_68 = loadelement:int(getstatic:int[](\u7049\ub70c\u392e\u93a2\ud12e\u8df4::\uc7fe\ub171\u3e75\u927d\u36d3\u64ab), invokevirtual:int(\u5bc4\u385b\ubefe\u8cae\u97b7\u385b::\u873d\ua61f\ubf56\u9af2\u47c2\u8709, p2:\u5bc4\u385b\ubefe\u8cae\u97b7\u385b))
        var_6_72 = loadelement:int(getstatic:int[](\u7049\ub70c\u392e\u93a2\ud12e\u8df4::\u647c\u98a4\u4179\u392e\ub70c\u5db4), invokevirtual:int(\u5bc4\u385b\ubefe\u8cae\u97b7\u385b::\u873d\ua61f\ubf56\u9af2\u47c2\u8709, p2:\u5bc4\u385b\ubefe\u8cae\u97b7\u385b))
        
        if (cmpeq:boolean(p1:int, ldc:int(0))) {
            return:int(add:int(var_5_68:int, loadelement:int(loadelement:int[](getstatic:int[][](\u7049\ub70c\u392e\u93a2\ud12e\u8df4::\u88c5\u59ec\u4f52\u92ee\u4cd9\u7873), ldc:int(6)), p0:int)))
        }
        
        return:int(add:int(var_5_68:int, loadelement:int(loadelement:int[](getstatic:int[][](\u7049\ub70c\u392e\u93a2\ud12e\u8df4::\u88c5\u59ec\u4f52\u92ee\u4cd9\u7873), var_6_72:int), p0:int)))
    }
    
    public static int \u3d4b\u8bb0\u9a18\ua61f\uc29a\u647c(int p0, \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u5bc4\u385b\ubefe\u8cae\u97b7\u385b p1, int p2) {
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
        
        if (cmpeq:boolean(p0:int, ldc:int(15))) {
            return:int(invokestatic:int(Math::min, ldc:int(64), mul:int(p2:int, and:int(ldc:int(19), ldc:int(25703)))))
        }
        
        if (cmpne:boolean(p0:int, ldc:int(14))) {
            return:int(invokestatic:int(Math::min, ldc:int(64), add:int(loadelement:int(getstatic:int[](\u7049\ub70c\u392e\u93a2\ud12e\u8df4::\u97e6\u4975\u1833\u3d64\u3d64\u385b), invokevirtual:int(\u5bc4\u385b\ubefe\u8cae\u97b7\u385b::\u873d\ua61f\ubf56\u9af2\u47c2\u8709, p1:\u5bc4\u385b\ubefe\u8cae\u97b7\u385b)), loadelement:int(loadelement:int[](getstatic:int[][](\u7049\ub70c\u392e\u93a2\ud12e\u8df4::\u527a\u6bb9\u7ce1\u759a\u983f\u71f1), invokevirtual:int(\u5bc4\u385b\ubefe\u8cae\u97b7\u385b::\u873d\ua61f\ubf56\u9af2\u47c2\u8709, p1:\u5bc4\u385b\ubefe\u8cae\u97b7\u385b)), invokestatic:int(Math::min, p0:int, ldc:int(13))))))
        }
        
        return:int(invokestatic:int(Math::min, ldc:int(64), mul:int(p2:int, and:int(ldc:int(16402), ldc:int(106)))))
    }
    
    public static int \u8308\u36d3\u3d4b\u6ec6\u7873\u3d4b(\ud36e\u6bb9\u960f\u4c04\u64ab.\u8d90\u156b\u8d90\u718f\uf9c5\ub171 p0, int p1, int p2, boolean p3) {
        var_4_98 : int
        var_6_67 : int[]
        stack_D0_0 : int [generated]
        var_4_CE : int
        var_7_D0 : int
        var_8_F0 : int
        var_4_140 : int
        var_10_14F : int
        var_11_158 : int
        var_4_246 : int
        stack_232_0 : int [generated]
        var_12_232 : int
        stack_267_0 : int [generated]
        expr_284 : int[] [generated]
        expr_286 : int [generated]
        var_11_1DC : int
        
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
        var_4_98 = and:int(ldc:int(20729937), ldc:int(-1258464394))
        var_6_67 = newarray:int[](int.class, ldc:int(64))
        
        if (cmpgt:boolean(p2:int, p1:int)) {
            do {
                if (cmpne:boolean(and:int(var_4_98:int, ldc:int(128)), ldc:int(0))) {
                    var_4_98 = and:int(var_4_98:int, ldc:int(1685739772))
                }
                else {
                    var_4_98 = and:int(var_4_98:int, ldc:int(1524412976))
                    
                    if (logicalnot:boolean(p3:boolean)) {
                        loopcontinue()
                    }
                    
                    stack_D0_0 = and:int(ldc:int(10243), ldc:int(1290))
                    Label_0201:
                    var_4_CE = and:int(var_4_98:int, ldc:int(-2122351844))
                    var_7_D0 = stack_D0_0:int
                    
                    if (logicalnot:boolean(p3:boolean)) {
                        var_4_CE = and:int(var_4_CE:int, ldc:int(1153175889))
                        var_8_F0 = shl:int(shr:int(sub:int(p2:int, p1:int), and:int(ldc:int(513), ldc:int(5155))), xor:int(ldc:int(4109), ldc:int(4108)))
                    }
                    else {
                        var_8_F0 = shl:int(shr:int(add:int(sub:int(p2:int, p1:int), xor:int(ldc:int(721), ldc:int(723))), and:int(ldc:int(1070), ldc:int(2242))), and:int(ldc:int(923), ldc:int(1)))
                    }
                    
                    do {
                        if (cmpeq:boolean(and:int(var_4_CE:int, ldc:int(134217728)), ldc:int(0))) {
                            var_4_CE = and:int(var_4_CE:int, ldc:int(-1874939758))
                            var_8_F0 = invokestatic:int(Math::min, var_8_F0:int, ldc:int(63))
                            
                            if (cmpgt:boolean(var_8_F0:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            return:int(and:int(ldc:int(8273), ldc:int(2951)))
                        }
                    } while (cmpeq:boolean(and:int(var_4_CE:int, ldc:int(524288)), ldc:int(0)))
                    
                    var_4_140 = and:int(var_4_CE:int, ldc:int(436205074))
                    var_10_14F = sub:int(p2:int, add:int(p1:int, mul:int(var_8_F0:int, var_7_D0:int)))
                    var_11_158 = and:int(ldc:int(5709), ldc:int(-5838))
                    
                    while (cmplt:boolean(var_11_158:int, var_8_F0:int)) {
                        storeelement:int(var_6_67:int[], var_11_158:int, var_7_D0:int)
                        inc:int(var_11_158, ldc:int(1))
                    }
                    
                    loop {
                        if (cmpne:boolean(and:int(var_4_140:int, ldc:int(32)), ldc:int(0))) {
                            var_4_246 = and:int(var_4_140:int, ldc:int(738340855))
                            goto(Label_0507)
                        }
                        
                        if (cmpeq:boolean(and:int(var_4_140:int, ldc:int(1048576)), ldc:int(0))) {
                            var_4_246 = and:int(var_4_140:int, ldc:int(-1961108451))
                        }
                        else {
                            var_4_246 = and:int(var_4_140:int, ldc:int(-1195429798))
                            
                            if (cmpne:boolean(var_10_14F:int, ldc:int(0))) {
                                if (cmple:boolean(var_10_14F:int, ldc:int(0))) {
                                    goto(Label_0507)
                                }
                                
                                stack_232_0 = ldc:int(-1)
                                goto(Label_0555)
                            }
                        }
                        
                        Label_0423:
                        
                        if (cmpeq:boolean(and:int(var_4_246:int, ldc:int(8192)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_4_246:int, ldc:int(536870912)), ldc:int(0))) {
                                var_4_140 = and:int(var_4_246:int, ldc:int(-1568520896))
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        Label_0507:
                        
                        if (cmpne:boolean(and:int(var_4_246:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0423)
                        }
                        
                        if (cmpne:boolean(and:int(var_4_246:int, ldc:int(512)), ldc:int(0))) {
                            var_4_140 = and:int(var_4_246:int, ldc:int(-869611848))
                            loopcontinue()
                        }
                        
                        var_4_246 = and:int(var_4_246:int, ldc:int(253662035))
                        stack_232_0 = xor:int(ldc:int(4100), ldc:int(4101))
                        Label_0555:
                        var_4_246 = and:int(var_4_246:int, ldc:int(1700763252))
                        var_12_232 = stack_232_0:int
                        
                        if (cmple:boolean(var_10_14F:int, ldc:int(0))) {
                            goto(Label_0569)
                        }
                        
                        stack_267_0 = sub:int(var_8_F0:int, xor:int(ldc:int(-28672), ldc:int(-28671)))
                        goto(Label_0608)
                        Label_0617:
                        
                        while (cmpeq:boolean(and:int(var_4_246:int, ldc:int(256)), ldc:int(0))) {
                            var_4_246 = and:int(var_4_246:int, ldc:int(1514009554))
                            
                            if (cmpeq:boolean(var_10_14F:int, ldc:int(0))) {
                                goto(Label_0423)
                            }
                            
                            expr_284 = var_6_67:int[]
                            expr_286 = var_11_158:int
                            storeelement:int(expr_284:int[], expr_286:int, sub:int(loadelement:int(expr_284:int[], expr_286:int), var_12_232:int))
                            var_11_158 = add:int(var_11_158:int, var_12_232:int)
                            var_10_14F = add:int(var_10_14F:int, var_12_232:int)
                        }
                        
                        Label_0569:
                        
                        if (cmpne:boolean(and:int(var_4_246:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0617)
                        }
                        
                        var_4_246 = and:int(var_4_246:int, ldc:int(861902866))
                        stack_267_0 = and:int(ldc:int(-21517), ldc:int(21516))
                        Label_0608:
                        var_4_246 = and:int(var_4_246:int, ldc:int(668966779))
                        var_11_158 = stack_267_0:int
                        goto(Label_0617)
                    }
                    
                    storeelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\uae5d\u67e9\ube23\u0c95\u8aa5\u4e72, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), and:int(ldc:int(14604), ldc:int(-14736)), p1:int)
                    var_11_1DC = xor:int(ldc:int(16930), ldc:int(16931))
                    
                    while (cmple:boolean(var_11_1DC:int, var_8_F0:int)) {
                        storeelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\uae5d\u67e9\ube23\u0c95\u8aa5\u4e72, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), var_11_1DC:int, add:int(loadelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\uae5d\u67e9\ube23\u0c95\u8aa5\u4e72, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), sub:int(var_11_1DC:int, xor:int(ldc:int(452), ldc:int(453)))), loadelement:int(var_6_67:int[], sub:int(var_11_1DC:int, xor:int(ldc:int(-32767), ldc:int(-32768))))))
                        inc:int(var_11_1DC, ldc:int(1))
                    }
                    
                    putfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ufcaf\u965f\u8aa5\u47c2\u34df\u9af2, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171, var_8_F0:int)
                    putfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ufcaf\u965f\u8aa5\u47c2\u34df\u9af2, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171, invokestatic:int(Math::min, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ufcaf\u965f\u8aa5\u47c2\u34df\u9af2, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), ldc:int(64)))
                    return:int(and:int(ldc:int(27798), ldc:int(-27799)))
                }
            } while (cmpne:boolean(and:int(var_4_98:int, ldc:int(32768)), ldc:int(0)))
            
            var_4_98 = and:int(var_4_98:int, ldc:int(1749024447))
            stack_D0_0 = xor:int(ldc:int(184), ldc:int(185))
            goto(Label_0201)
        }
        
        putfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ufcaf\u965f\u8aa5\u47c2\u34df\u9af2, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171, and:int(ldc:int(25985), ldc:int(-25986)))
        return:int(and:int(ldc:int(69), ldc:int(20865)))
    }
    
    public static int \u16f6\u965f\u4f4a\u7873\u51b2\u6c56(int p0, int p1, int p2, int p3) {
        var_6_6A : float
        
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
            var_6_6A = d2f:float(invokestatic:double(Math::log, ldc:double(2.0)))
            
            if (cmpne:boolean(p0:int, ldc:int(0))) {
                var_6_6A = mul:float(var_6_6A:float, ldc:float(1.3f))
            }
            
            return:int(d2i:int(add:double(div:double(mul:double(i2d:double(p1:int), invokestatic:double(Math::log, f2d:double(div:float(i2f:float(p3:int), i2f:float(p2:int))))), f2d:double(var_6_6A:float)), ldc:double(0.5))))
        }
        
        goto(Label_0006)
    }
    
    public static float \u7ce1\u7ce1\u92ee\ud171\u5245\u6bb9(int p0, int p1, int p2) {
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
            return:float(d2f:float(invokestatic:double(Math::pow, f2d:double(div:float(i2f:float(p2:int), i2f:float(p1:int))), f2d:double(div:float(ldc:float(1.0f), i2f:float(p0:int))))))
        }
        
        goto(Label_0006)
    }
    
    public static int \u88c5\u6fb0\u4daf\u8cae\u93a2\u4492(\ud36e\u6bb9\u960f\u4c04\u64ab.\u8d90\u156b\u8d90\u718f\uf9c5\ub171 p0, int p1, int p2, int p3, boolean p4) {
        var_5_61 : int
        var_7_67 : int[]
        var_8_6D : int[]
        var_9_73 : int[]
        var_10_79 : int[]
        expr_82 : int[] [generated]
        var_11_AF : int[]
        var_5_BB : int
        var_12_C9 : int
        var_13_E6 : int
        var_14_E9 : int
        var_5_125 : int
        var_15_147 : int
        var_5_153 : int
        var_16_15D : float
        var_17_161 : float
        var_18_169 : int
        var_19_172 : int
        var_20_213 : int
        var_5_2DC : int
        var_21_2FE : int
        var_16_308 : float
        var_17_30D : float
        var_18_315 : int
        var_19_31E : int
        var_20_560 : int
        var_20_5B3 : int
        var_19_71E : int
        
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
        var_5_61 = and:int(ldc:int(822603840), ldc:int(1630064713))
        var_7_67 = newarray:int[](int.class, ldc:int(64))
        var_8_6D = newarray:int[](int.class, ldc:int(64))
        var_9_73 = newarray:int[](int.class, ldc:int(64))
        var_10_79 = newarray:int[](int.class, ldc:int(64))
        expr_82 = newarray:int[](int.class, and:int(ldc:int(3), ldc:int(9571)))
        storeelement:int(expr_82:int[], and:int(ldc:int(9241), ldc:int(-9882)), ldc:int(6))
        storeelement:int(expr_82:int[], xor:int(ldc:int(3600), ldc:int(3601)), xor:int(ldc:int(8643), ldc:int(8646)))
        storeelement:int(expr_82:int[], and:int(ldc:int(13382), ldc:int(16898)), and:int(ldc:int(4677), ldc:int(16412)))
        var_11_AF = expr_82:int[]
        
        if (cmple:boolean(p2:int, p1:int)) {
            putfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ufcaf\u965f\u8aa5\u47c2\u34df\u9af2, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171, and:int(ldc:int(12905), ldc:int(-16106)))
            return:int(and:int(ldc:int(8737), ldc:int(22545)))
        }
        
        var_5_BB = and:int(var_5_61:int, ldc:int(1763210823))
        var_12_C9 = loadelement:int(var_11_AF:int[], sub:int(p3:int, and:int(ldc:int(10785), ldc:int(321))))
        
        if (cmple:boolean(f2d:double(div:float(i2f:float(p2:int), i2f:float(p1:int))), ldc:double(2.2449))) {
            var_5_BB = and:int(var_5_BB:int, ldc:int(193485393))
            var_13_E6 = and:int(ldc:int(-6802), ldc:int(6801))
            var_14_E9 = p2:int
        }
        else {
            var_13_E6 = xor:int(ldc:int(-15358), ldc:int(-15357))
            var_14_E9 = shl:int(p1:int, and:int(ldc:int(13825), ldc:int(193)))
        }
        
        var_5_125 = and:int(var_5_BB:int, ldc:int(389807065))
        var_15_147 = invokestatic:int(Math::min, mul:int(and:int(ldc:int(1027), ldc:int(8590)), invokestatic:int(\u7049\ub70c\u392e\u93a2\ud12e\u8df4::\u16f6\u965f\u4f4a\u7873\u51b2\u6c56, and:int(ldc:int(-5230), ldc:int(4173)), var_12_C9:int, p1:int, var_14_E9:int)), ldc:int(63))
        
        if (cmple:boolean(var_15_147:int, ldc:int(0))) {
            return:int(and:int(ldc:int(28165), ldc:int(4353)))
        }
        
        var_5_153 = and:int(var_5_125:int, ldc:int(2066706513))
        var_16_15D = invokestatic:float(\u7049\ub70c\u392e\u93a2\ud12e\u8df4::\u7ce1\u7ce1\u92ee\ud171\u5245\u6bb9, var_15_147:int, p1:int, var_14_E9:int)
        var_17_161 = i2f:float(p1:int)
        var_18_169 = f2i:int(add:float(var_17_161:float, ldc:float(0.5f)))
        var_19_172 = and:int(ldc:int(-2547), ldc:int(2530))
        
        while (cmple:boolean(var_19_172:int, var_15_147:int)) {
            var_20_213 = var_18_169:int
            var_17_161 = mul:float(var_17_161:float, var_16_15D:float)
            var_18_169 = f2i:int(add:float(var_17_161:float, ldc:float(0.5f)))
            storeelement:int(var_7_67:int[], var_19_172:int, sub:int(var_18_169:int, var_20_213:int))
            inc:int(var_19_172, ldc:int(1))
        }
        
        loop {
            Label_0401:
            
            if (cmpeq:boolean(and:int(var_5_153:int, ldc:int(2147483647)), ldc:int(0))) {
                var_5_153 = and:int(var_5_153:int, ldc:int(221321037))
                goto(Label_1050)
            }
            
            if (cmpeq:boolean(and:int(var_5_153:int, ldc:int(16)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_5_153:int, ldc:int(1)), ldc:int(0))) {
                    var_5_153 = and:int(var_5_153:int, ldc:int(-1761148946))
                    goto(Label_0855)
                }
                
                if (cmpne:boolean(and:int(var_5_153:int, ldc:int(134217728)), ldc:int(0))) {
                    var_5_153 = and:int(var_5_153:int, ldc:int(2006296092))
                    goto(Label_0657)
                }
                
                if (cmpne:boolean(and:int(var_5_153:int, ldc:int(2097152)), ldc:int(0))) {
                    var_5_153 = and:int(var_5_153:int, ldc:int(240279418))
                    goto(Label_0575)
                }
                
                var_5_153 = and:int(var_5_153:int, ldc:int(1463056875))
                invokestatic:void(Arrays::sort, var_7_67:int[], and:int(ldc:int(-14689), ldc:int(6496)), var_15_147:int)
                storeelement:int(var_9_73:int[], and:int(ldc:int(-25046), ldc:int(16725)), p1:int)
                var_19_172 = and:int(ldc:int(2049), ldc:int(25493))
                goto(Label_0568)
            }
            
            Label_0976:
            
            while (cmpne:boolean(and:int(var_5_153:int, ldc:int(4096)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_5_153:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0855)
                }
                
                if (cmpeq:boolean(and:int(var_5_153:int, ldc:int(16384)), ldc:int(0))) {
                    var_5_153 = and:int(var_5_153:int, ldc:int(-529861720))
                    goto(Label_0657)
                }
                
                if (cmpne:boolean(and:int(var_5_153:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_0575)
                }
                
                if (cmpeq:boolean(and:int(var_5_153:int, ldc:int(16777216)), ldc:int(0))) {
                    loopcontinue(Label_0401)
                }
                
                var_5_153 = and:int(var_5_153:int, ldc:int(-1852934811))
                
                if (cmpgt:boolean(var_19_172:int, var_15_147:int)) {
                    goto(Label_1050)
                }
                
                storeelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\uae5d\u67e9\ube23\u0c95\u8aa5\u4e72, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), var_19_172:int, loadelement:int(var_9_73:int[], var_19_172:int))
                inc:int(var_19_172, ldc:int(1))
            }
            
            var_5_153 = and:int(var_5_153:int, ldc:int(1325543217))
            goto(Label_1050)
            Label_0568:
            
            if (cmple:boolean(var_19_172:int, var_15_147:int)) {
                storeelement:int(var_9_73:int[], var_19_172:int, add:int(loadelement:int(var_9_73:int[], sub:int(var_19_172:int, and:int(ldc:int(711), ldc:int(41)))), loadelement:int(var_7_67:int[], sub:int(var_19_172:int, and:int(ldc:int(27457), ldc:int(1037))))))
                
                if (cmpne:boolean(loadelement:int(var_7_67:int[], sub:int(var_19_172:int, xor:int(ldc:int(8256), ldc:int(8257)))), ldc:int(0))) {
                    goto(Label_0855)
                }
                
                return:int(and:int(ldc:int(105), ldc:int(273)))
            }
            
            Label_0575:
            
            if (cmpeq:boolean(and:int(var_5_153:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_1050)
            }
            
            if (cmpne:boolean(and:int(var_5_153:int, ldc:int(256)), ldc:int(0))) {
                var_5_153 = and:int(var_5_153:int, ldc:int(414506088))
                goto(Label_0976)
            }
            
            if (cmpeq:boolean(and:int(var_5_153:int, ldc:int(16777216)), ldc:int(0))) {
                var_5_153 = and:int(var_5_153:int, ldc:int(-109691397))
                goto(Label_0855)
            }
            
            if (cmpne:boolean(and:int(var_5_153:int, ldc:int(2097152)), ldc:int(0))) {
                var_5_153 = and:int(var_5_153:int, ldc:int(2114771452))
            }
            else {
                if (cmpne:boolean(and:int(var_5_153:int, ldc:int(256)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_5_153 = and:int(var_5_153:int, ldc:int(703455220))
                
                if (cmpeq:boolean(var_13_E6:int, ldc:int(0))) {
                    var_19_172 = and:int(ldc:int(29288), ldc:int(-29290))
                    goto(Label_0976)
                }
            }
            
            Label_0657:
            
            if (cmpne:boolean(and:int(var_5_153:int, ldc:int(1073741824)), ldc:int(0))) {
                var_5_153 = and:int(var_5_153:int, ldc:int(-702944103))
                goto(Label_1050)
            }
            
            if (cmpeq:boolean(and:int(var_5_153:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0976)
            }
            
            if (cmpne:boolean(and:int(var_5_153:int, ldc:int(256)), ldc:int(0))) {
                var_5_153 = and:int(var_5_153:int, ldc:int(-1418030304))
            }
            else {
                if (cmpne:boolean(and:int(var_5_153:int, ldc:int(2097152)), ldc:int(0))) {
                    var_5_153 = and:int(var_5_153:int, ldc:int(-230434997))
                    goto(Label_0575)
                }
                
                if (cmpne:boolean(and:int(var_5_153:int, ldc:int(1073741824)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_5_2DC = and:int(var_5_153:int, ldc:int(589821639))
                var_21_2FE = invokestatic:int(Math::min, mul:int(and:int(ldc:int(20546), ldc:int(10374)), invokestatic:int(\u7049\ub70c\u392e\u93a2\ud12e\u8df4::\u16f6\u965f\u4f4a\u7873\u51b2\u6c56, xor:int(ldc:int(8213), ldc:int(8212)), var_12_C9:int, var_14_E9:int, p2:int)), ldc:int(63))
                var_16_308 = invokestatic:float(\u7049\ub70c\u392e\u93a2\ud12e\u8df4::\u7ce1\u7ce1\u92ee\ud171\u5245\u6bb9, var_21_2FE:int, var_14_E9:int, p2:int)
                var_17_30D = i2f:float(var_14_E9:int)
                var_18_315 = f2i:int(add:float(var_17_30D:float, ldc:float(0.5f)))
                var_19_31E = and:int(ldc:int(16387), ldc:int(-16388))
                
                while (cmple:boolean(var_19_31E:int, sub:int(var_21_2FE:int, and:int(ldc:int(2085), ldc:int(9473))))) {
                    var_20_560 = var_18_315:int
                    var_17_30D = mul:float(var_17_30D:float, var_16_308:float)
                    var_18_315 = f2i:int(add:float(var_17_30D:float, ldc:float(0.5f)))
                    storeelement:int(var_8_6D:int[], var_19_31E:int, sub:int(var_18_315:int, var_20_560:int))
                    inc:int(var_19_31E, ldc:int(1))
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_5_2DC:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1753)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_2DC:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_5_2DC = and:int(var_5_2DC:int, ldc:int(-1479162929))
                        goto(Label_1662)
                    }
                    
                    if (cmpne:boolean(and:int(var_5_2DC:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1527)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_2DC:int, ldc:int(64)), ldc:int(0))) {
                        var_5_2DC = and:int(var_5_2DC:int, ldc:int(376926445))
                    }
                    else {
                        var_5_2DC = and:int(var_5_2DC:int, ldc:int(-2022453179))
                        
                        if (cmplt:boolean(loadelement:int(var_8_6D:int[], and:int(ldc:int(-6057), ldc:int(5032))), loadelement:int(var_7_67:int[], sub:int(var_15_147:int, and:int(ldc:int(13151), ldc:int(19489)))))) {
                            invokestatic:void(Arrays::sort, var_8_6D:int[], and:int(ldc:int(-26002), ldc:int(26001)), add:int(var_21_2FE:int, and:int(ldc:int(193), ldc:int(25359))))
                            var_20_5B3 = sub:int(loadelement:int(var_7_67:int[], sub:int(var_15_147:int, and:int(ldc:int(797), ldc:int(30755)))), loadelement:int(var_8_6D:int[], and:int(ldc:int(-9163), ldc:int(8648))))
                            storeelement:int(var_8_6D:int[], and:int(ldc:int(-2453), ldc:int(2452)), loadelement:int(var_7_67:int[], sub:int(var_15_147:int, xor:int(ldc:int(6912), ldc:int(6913)))))
                            storeelement:int(var_8_6D:int[], sub:int(var_21_2FE:int, xor:int(ldc:int(6304), ldc:int(6305))), sub:int(loadelement:int(var_8_6D:int[], sub:int(var_21_2FE:int, xor:int(ldc:int(21568), ldc:int(21569)))), var_20_5B3:int))
                        }
                    }
                    
                    Label_1283:
                    
                    if (cmpne:boolean(and:int(var_5_2DC:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1753)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_2DC:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1662)
                    }
                    
                    if (cmpne:boolean(and:int(var_5_2DC:int, ldc:int(256)), ldc:int(0))) {
                        var_5_2DC = and:int(var_5_2DC:int, ldc:int(-1188799267))
                        goto(Label_1527)
                    }
                    
                    if (cmpne:boolean(and:int(var_5_2DC:int, ldc:int(2097152)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_5_2DC = and:int(var_5_2DC:int, ldc:int(-2091616169))
                    invokestatic:void(Arrays::sort, var_8_6D:int[], and:int(ldc:int(-26384), ldc:int(8719)), var_21_2FE:int)
                    storeelement:int(var_10_79:int[], and:int(ldc:int(10561), ldc:int(-10594)), var_14_E9:int)
                    var_19_31E = xor:int(ldc:int(192), ldc:int(193))
                    Label_1520:
                    
                    if (cmple:boolean(var_19_31E:int, var_21_2FE:int)) {
                        storeelement:int(var_10_79:int[], var_19_31E:int, add:int(loadelement:int(var_10_79:int[], sub:int(var_19_31E:int, and:int(ldc:int(289), ldc:int(29719)))), loadelement:int(var_8_6D:int[], sub:int(var_19_31E:int, xor:int(ldc:int(2196), ldc:int(2197))))))
                        
                        if (cmpne:boolean(loadelement:int(var_8_6D:int[], sub:int(var_19_31E:int, xor:int(ldc:int(10308), ldc:int(10309)))), ldc:int(0))) {
                            goto(Label_1662)
                        }
                        
                        return:int(xor:int(ldc:int(3329), ldc:int(3328)))
                    }
                    
                    Label_1527:
                    
                    if (cmpeq:boolean(and:int(var_5_2DC:int, ldc:int(64)), ldc:int(0))) {
                        var_5_2DC = and:int(var_5_2DC:int, ldc:int(86579754))
                        goto(Label_1753)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_2DC:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_5_2DC:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_1283)
                        }
                        
                        if (cmpeq:boolean(and:int(var_5_2DC:int, ldc:int(16)), ldc:int(0))) {
                            var_5_2DC = and:int(var_5_2DC:int, ldc:int(-217024059))
                            putfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ufcaf\u965f\u8aa5\u47c2\u34df\u9af2, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171, add:int(var_15_147:int, var_21_2FE:int))
                            putfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ufcaf\u965f\u8aa5\u47c2\u34df\u9af2, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171, invokestatic:int(Math::min, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ufcaf\u965f\u8aa5\u47c2\u34df\u9af2, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), ldc:int(64)))
                            var_19_31E = and:int(ldc:int(3909), ldc:int(-4038))
                            
                            while (cmple:boolean(var_19_31E:int, var_15_147:int)) {
                                storeelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\uae5d\u67e9\ube23\u0c95\u8aa5\u4e72, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), var_19_31E:int, loadelement:int(var_9_73:int[], var_19_31E:int))
                                inc:int(var_19_31E, ldc:int(1))
                            }
                            
                            goto(Label_1753)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1662:
                    
                    if (cmpne:boolean(and:int(var_5_2DC:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_5_2DC:int, ldc:int(128)), ldc:int(0))) {
                            var_5_2DC = and:int(var_5_2DC:int, ldc:int(-557139795))
                            goto(Label_1527)
                        }
                        
                        if (cmpne:boolean(and:int(var_5_2DC:int, ldc:int(8388608)), ldc:int(0))) {
                            var_5_2DC = and:int(var_5_2DC:int, ldc:int(1224726581))
                            goto(Label_1283)
                        }
                        
                        if (cmpne:boolean(and:int(var_5_2DC:int, ldc:int(4096)), ldc:int(0))) {
                            var_5_2DC = and:int(var_5_2DC:int, ldc:int(323026384))
                            inc:int(var_19_31E, ldc:int(1))
                            goto(Label_1520)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1753:
                    
                    if (cmpeq:boolean(and:int(var_5_2DC:int, ldc:int(16384)), ldc:int(0))) {
                        var_5_2DC = and:int(var_5_2DC:int, ldc:int(1392163543))
                        goto(Label_1662)
                    }
                    
                    if (cmpne:boolean(and:int(var_5_2DC:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1527)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_2DC:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_2DC:int, ldc:int(134217728)), ldc:int(0))) {
                        var_19_71E = add:int(var_15_147:int, xor:int(ldc:int(16650), ldc:int(16651)))
                        
                        while (cmple:boolean(var_19_71E:int, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ufcaf\u965f\u8aa5\u47c2\u34df\u9af2, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171))) {
                            storeelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\uae5d\u67e9\ube23\u0c95\u8aa5\u4e72, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), var_19_71E:int, loadelement:int(var_10_79:int[], sub:int(var_19_71E:int, var_15_147:int)))
                            inc:int(var_19_71E, ldc:int(1))
                        }
                        
                        return:int(and:int(ldc:int(-6862), ldc:int(6857)))
                    }
                    
                    var_5_2DC = and:int(var_5_2DC:int, ldc:int(1887287834))
                }
            }
            
            Label_0855:
            
            if (cmpne:boolean(and:int(var_5_153:int, ldc:int(16384)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_5_153:int, ldc:int(16384)), ldc:int(0))) {
                    var_5_153 = and:int(var_5_153:int, ldc:int(-1232476803))
                    goto(Label_0976)
                }
                
                if (cmpeq:boolean(and:int(var_5_153:int, ldc:int(4096)), ldc:int(0))) {
                    var_5_153 = and:int(var_5_153:int, ldc:int(-344404301))
                    goto(Label_0657)
                }
                
                if (cmpne:boolean(and:int(var_5_153:int, ldc:int(2097152)), ldc:int(0))) {
                    var_5_153 = and:int(var_5_153:int, ldc:int(992825432))
                    goto(Label_0575)
                }
                
                if (cmpne:boolean(and:int(var_5_153:int, ldc:int(128)), ldc:int(0))) {
                    var_5_153 = and:int(var_5_153:int, ldc:int(-1101979235))
                    loopcontinue()
                }
                
                var_5_153 = and:int(var_5_153:int, ldc:int(-1894523167))
                inc:int(var_19_172, ldc:int(1))
                goto(Label_0568)
            }
            
            Label_1050:
            
            if (cmpne:boolean(and:int(var_5_153:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0976)
            }
            
            if (cmpeq:boolean(and:int(var_5_153:int, ldc:int(16777216)), ldc:int(0))) {
                var_5_153 = and:int(var_5_153:int, ldc:int(-1462796779))
                goto(Label_0855)
            }
            
            if (cmpne:boolean(and:int(var_5_153:int, ldc:int(2097152)), ldc:int(0))) {
                var_5_153 = and:int(var_5_153:int, ldc:int(844446078))
                goto(Label_0657)
            }
            
            if (cmpne:boolean(and:int(var_5_153:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0575)
            }
            
            if (cmpne:boolean(and:int(var_5_153:int, ldc:int(16384)), ldc:int(0))) {
                putfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ufcaf\u965f\u8aa5\u47c2\u34df\u9af2, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171, var_15_147:int)
                putfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ufcaf\u965f\u8aa5\u47c2\u34df\u9af2, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171, invokestatic:int(Math::min, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ufcaf\u965f\u8aa5\u47c2\u34df\u9af2, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), ldc:int(64)))
                return:int(and:int(ldc:int(8857), ldc:int(-25244)))
            }
            
            var_5_153 = and:int(var_5_153:int, ldc:int(-956622207))
        }
    }
    
    public static int \ud7e8\u3d4b\u4daf\u9255\u12cb\ub113(\ud36e\u6bb9\u960f\u4c04\u64ab.\u8d90\u156b\u8d90\u718f\uf9c5\ub171 p0, int p1, int p2) {
        var_3_5F : int
        var_5_67 : int
        var_3_208 : int
        var_6_D1 : int
        stack_264_0 : int [generated]
        var_3_8CF : int
        var_7_264 : int
        var_6_26D : int
        var_8_8C0 : int
        
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
        var_3_5F = and:int(ldc:int(2094274486), ldc:int(1023309051))
        var_5_67 = and:int(ldc:int(17572), ldc:int(-17589))
        
        if (cmpgt:boolean(getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ufcaf\u965f\u8aa5\u47c2\u34df\u9af2, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p1:int)) {
            var_3_208 = and:int(var_3_5F:int, ldc:int(-77677086))
            putfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\uc229\u40a9\u4c04\u51fa\u3a62\ub70c, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171, sub:int(getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ufcaf\u965f\u8aa5\u47c2\u34df\u9af2, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p1:int))
            putfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ub6ab\u8c8a\u4c04\u69d9\u7043\u6c52, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171, add:int(shr:int(getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\uc229\u40a9\u4c04\u51fa\u3a62\ub70c, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), and:int(ldc:int(753), ldc:int(257))), sub:int(getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\uc229\u40a9\u4c04\u51fa\u3a62\ub70c, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), shl:int(shr:int(getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\uc229\u40a9\u4c04\u51fa\u3a62\ub70c, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), and:int(ldc:int(197), ldc:int(21009))), and:int(ldc:int(41), ldc:int(28675))))))
            storeelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ua068\u9033\u52d3\uf94d\u56bd\u0b8e, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), and:int(ldc:int(-10324), ldc:int(10322)), getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ub6ab\u8c8a\u4c04\u69d9\u7043\u6c52, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171))
            storeelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ua068\u9033\u52d3\uf94d\u56bd\u0b8e, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), xor:int(ldc:int(-24566), ldc:int(-24565)), getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\uc229\u40a9\u4c04\u51fa\u3a62\ub70c, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171))
            var_6_D1 = and:int(ldc:int(-7144), ldc:int(4967))
            
            while (cmple:boolean(var_6_D1:int, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\uc229\u40a9\u4c04\u51fa\u3a62\ub70c, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171))) {
                storeelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u3776\u120d\uc910\u836c\u600f\uae87, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), and:int(ldc:int(26721), ldc:int(145))), var_6_D1:int, loadelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\uae5d\u67e9\ube23\u0c95\u8aa5\u4e72, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), add:int(var_6_D1:int, p1:int)))
                inc:int(var_6_D1, ldc:int(1))
            }
            
            loop {
                if (cmpne:boolean(and:int(var_3_208:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_0466)
                }
                
                if (cmpeq:boolean(and:int(var_3_208:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0407)
                }
                
                if (cmpeq:boolean(and:int(var_3_208:int, ldc:int(4096)), ldc:int(0))) {
                    var_3_208 = and:int(var_3_208:int, ldc:int(2115900829))
                }
                else {
                    var_3_208 = and:int(var_3_208:int, ldc:int(-1199620190))
                    putfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u4975\u4bc8\u71ae\ucef1\u4492\u7043, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171, sub:int(loadelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u3776\u120d\uc910\u836c\u600f\uae87, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), and:int(ldc:int(2331), ldc:int(24705))), getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\uc229\u40a9\u4c04\u51fa\u3a62\ub70c, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171)), loadelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u3776\u120d\uc910\u836c\u600f\uae87, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), and:int(ldc:int(4097), ldc:int(1715))), and:int(ldc:int(-2051), ldc:int(2050)))))
                    putfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u47c2\uafe7\u9af2\u6d99\uc246\u12cb, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171, loadelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u3776\u120d\uc910\u836c\u600f\uae87, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), xor:int(ldc:boolean(0), ldc:boolean(1))), and:int(ldc:int(5263), ldc:int(-5264))))
                    
                    if (cmpgt:boolean(getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u47c2\uafe7\u9af2\u6d99\uc246\u12cb, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), ldc:int(32))) {
                        return:int(xor:int(ldc:int(48), ldc:int(49)))
                    }
                }
                
                Label_0351:
                
                if (cmpeq:boolean(and:int(var_3_208:int, ldc:int(128)), ldc:int(0))) {
                    var_3_208 = and:int(var_3_208:int, ldc:int(36191121))
                    goto(Label_0466)
                }
                
                if (cmpne:boolean(and:int(var_3_208:int, ldc:int(32)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_3_208:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_208 = and:int(var_3_208:int, ldc:int(-44883215))
                        loopcontinue()
                    }
                    
                    var_3_208 = and:int(var_3_208:int, ldc:int(-42076758))
                    
                    if (cmpgt:boolean(add:int(getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u47c2\uafe7\u9af2\u6d99\uc246\u12cb, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u4975\u4bc8\u71ae\ucef1\u4492\u7043, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171)), ldc:int(64))) {
                        return:int(and:int(ldc:int(5377), ldc:int(27211)))
                    }
                }
                
                Label_0407:
                
                if (cmpne:boolean(and:int(var_3_208:int, ldc:int(131072)), ldc:int(0))) {
                    var_3_208 = and:int(var_3_208:int, ldc:int(479177080))
                }
                else {
                    if (cmpne:boolean(and:int(var_3_208:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0351)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_208:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_208 = and:int(var_3_208:int, ldc:int(1235321009))
                        loopcontinue()
                    }
                    
                    var_3_208 = and:int(var_3_208:int, ldc:int(2037857983))
                    
                    if (cmpne:boolean(and:int(getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\uc229\u40a9\u4c04\u51fa\u3a62\ub70c, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), xor:int(ldc:int(544), ldc:int(545))), ldc:int(0))) {
                        stack_264_0 = xor:int(ldc:int(-32560), ldc:int(-32559))
                        looporswitchbreak()
                    }
                }
                
                Label_0466:
                
                if (cmpne:boolean(and:int(var_3_208:int, ldc:int(65536)), ldc:int(0))) {
                    var_3_208 = and:int(var_3_208:int, ldc:int(980280504))
                    goto(Label_0407)
                }
                
                if (cmpeq:boolean(and:int(var_3_208:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_3_208 = and:int(var_3_208:int, ldc:int(-640637923))
                    goto(Label_0351)
                }
                
                if (cmpne:boolean(and:int(var_3_208:int, ldc:int(268435456)), ldc:int(0))) {
                    var_3_208 = and:int(var_3_208:int, ldc:int(-93045333))
                    stack_264_0 = and:int(ldc:int(-5235), ldc:int(5234))
                    looporswitchbreak()
                }
                
                var_3_208 = and:int(var_3_208:int, ldc:int(568558914))
            }
            
            var_3_8CF = and:int(var_3_208:int, ldc:int(-34316634))
            var_7_264 = stack_264_0:int
            var_6_26D = and:int(ldc:int(-31571), ldc:int(31312))
            
            loop {
                if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_2080)
                }
                
                if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(1)), ldc:int(0))) {
                    var_3_8CF = and:int(var_3_8CF:int, ldc:int(-1503394771))
                    goto(Label_1936)
                }
                
                if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_1779)
                }
                
                if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(524288)), ldc:int(0))) {
                    var_3_8CF = and:int(var_3_8CF:int, ldc:int(-166918812))
                    goto(Label_1645)
                }
                
                if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_1532)
                }
                
                if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(1)), ldc:int(0))) {
                    var_3_8CF = and:int(var_3_8CF:int, ldc:int(1733234133))
                    goto(Label_1384)
                }
                
                if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_1218)
                }
                
                if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(16384)), ldc:int(0))) {
                    var_3_8CF = and:int(var_3_8CF:int, ldc:int(410602077))
                    goto(Label_1083)
                }
                
                if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_0878)
                }
                
                if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(65536)), ldc:int(0))) {
                    var_3_8CF = and:int(var_3_8CF:int, ldc:int(1343395271))
                }
                else {
                    var_3_8CF = and:int(var_3_8CF:int, ldc:int(-69271558))
                    
                    if (cmple:boolean(var_6_26D:int, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ub6ab\u8c8a\u4c04\u69d9\u7043\u6c52, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171))) {
                        if (cmpne:boolean(var_6_26D:int, ldc:int(0))) {
                            goto(Label_1083)
                        }
                        
                        var_5_67 = and:int(ldc:int(-23360), ldc:int(19249))
                        goto(Label_1218)
                    }
                }
                
                Label_0753:
                
                if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_2080)
                }
                
                if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(134217728)), ldc:int(0))) {
                    var_3_8CF = and:int(var_3_8CF:int, ldc:int(1332616816))
                    goto(Label_1936)
                }
                
                if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_1779)
                }
                
                if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_1645)
                }
                
                if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_1532)
                }
                
                if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(1024)), ldc:int(0))) {
                    var_3_8CF = and:int(var_3_8CF:int, ldc:int(-1567293466))
                    goto(Label_1384)
                }
                
                if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(268435456)), ldc:int(0))) {
                    var_3_8CF = and:int(var_3_8CF:int, ldc:int(1158320922))
                    goto(Label_1218)
                }
                
                if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_1083)
                }
                
                if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(131072)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(128)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_8CF = and:int(var_3_8CF:int, ldc:int(2035775398))
                    putfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ub6ab\u61a4\u12b2\u3776\u9255\u3776, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171, and:int(ldc:int(12621), ldc:int(-13678)))
                    
                    if (cmpeq:boolean(getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u56bd\ubff1\u1833\u59ec\u8cae\u3d4b, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), ldc:int(0))) {
                        putfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ub6ab\u61a4\u12b2\u3776\u9255\u3776, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171, and:int(ldc:int(21513), ldc:int(3)))
                        goto(Label_1384)
                    }
                }
                
                Label_0878:
                
                if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_2080)
                }
                
                if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(65536)), ldc:int(0))) {
                    var_3_8CF = and:int(var_3_8CF:int, ldc:int(210639870))
                    goto(Label_1936)
                }
                
                if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_1779)
                }
                
                if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(524288)), ldc:int(0))) {
                    var_3_8CF = and:int(var_3_8CF:int, ldc:int(1405104023))
                    goto(Label_1645)
                }
                
                if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(536870912)), ldc:int(0))) {
                    var_3_8CF = and:int(var_3_8CF:int, ldc:int(1667581112))
                    goto(Label_1532)
                }
                
                if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(536870912)), ldc:int(0))) {
                    var_3_8CF = and:int(var_3_8CF:int, ldc:int(1177738692))
                    goto(Label_1384)
                }
                
                if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(33554432)), ldc:int(0))) {
                    var_3_8CF = and:int(var_3_8CF:int, ldc:int(390338515))
                    goto(Label_1218)
                }
                
                if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(1024)), ldc:int(0))) {
                    var_3_8CF = and:int(var_3_8CF:int, ldc:int(949125730))
                }
                else {
                    if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0753)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(128)), ldc:int(0))) {
                        var_3_8CF = and:int(var_3_8CF:int, ldc:int(-1867647680))
                        loopcontinue()
                    }
                    
                    var_3_8CF = and:int(var_3_8CF:int, ldc:int(-1134603022))
                    putfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ub6ab\u61a4\u12b2\u3776\u9255\u3776, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171, invokestatic:int(Math::max, and:int(ldc:int(1793), ldc:int(16495)), invokestatic:int(\u7049\ub70c\u392e\u93a2\ud12e\u8df4::\u16f6\u965f\u4f4a\u7873\u51b2\u6c56, and:int(ldc:int(-2658), ldc:int(2657)), getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u56bd\ubff1\u1833\u59ec\u8cae\u3d4b, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u47c2\uafe7\u9af2\u6d99\uc246\u12cb, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p2:int)))
                    putfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ub6ab\u61a4\u12b2\u3776\u9255\u3776, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171, invokestatic:int(Math::min, xor:int(ldc:int(6273), ldc:int(6276)), getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ub6ab\u61a4\u12b2\u3776\u9255\u3776, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171)))
                    goto(Label_1384)
                }
                
                Label_1083:
                
                if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_2080)
                }
                
                if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_1936)
                }
                
                if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(268435456)), ldc:int(0))) {
                    var_3_8CF = and:int(var_3_8CF:int, ldc:int(226477942))
                    goto(Label_1779)
                }
                
                if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_1645)
                }
                
                if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_1532)
                }
                
                if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_1384)
                }
                
                if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(2147483647)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(1)), ldc:int(0))) {
                        var_3_8CF = and:int(var_3_8CF:int, ldc:int(-1277990387))
                        goto(Label_0878)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_8CF = and:int(var_3_8CF:int, ldc:int(-1834211340))
                        goto(Label_0753)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(128)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_8CF = and:int(var_3_8CF:int, ldc:int(2130452454))
                    var_5_67 = sub:int(mul:int(and:int(ldc:int(1283), ldc:int(18454)), var_6_26D:int), var_7_264:int)
                }
                
                Label_1218:
                
                if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(262144)), ldc:int(0))) {
                    var_3_8CF = and:int(var_3_8CF:int, ldc:int(728144654))
                    goto(Label_2080)
                }
                
                if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(33554432)), ldc:int(0))) {
                    var_3_8CF = and:int(var_3_8CF:int, ldc:int(19703597))
                    goto(Label_1936)
                }
                
                if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_1779)
                }
                
                if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_1645)
                }
                
                if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_1532)
                }
                
                if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(262144)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0878)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(1)), ldc:int(0))) {
                        var_3_8CF = and:int(var_3_8CF:int, ldc:int(-2031426756))
                        goto(Label_0753)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(32)), ldc:int(0))) {
                        var_3_8CF = and:int(var_3_8CF:int, ldc:int(-243872883))
                        loopcontinue()
                    }
                    
                    var_3_8CF = and:int(var_3_8CF:int, ldc:int(2046213802))
                    storeelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u3776\u120d\uc910\u836c\u600f\uae87, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), and:int(ldc:int(19508), ldc:int(-28469))), var_6_26D:int, loadelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u3776\u120d\uc910\u836c\u600f\uae87, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), xor:int(ldc:int(-24564), ldc:int(-24563))), var_5_67:int))
                    inc:int(var_6_26D, ldc:int(1))
                    loopcontinue()
                }
                
                Label_1384:
                
                if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(524288)), ldc:int(0))) {
                    var_3_8CF = and:int(var_3_8CF:int, ldc:int(-1026607918))
                    goto(Label_2080)
                }
                
                if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(32)), ldc:int(0))) {
                    var_3_8CF = and:int(var_3_8CF:int, ldc:int(890839434))
                    goto(Label_1936)
                }
                
                if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(134217728)), ldc:int(0))) {
                    var_3_8CF = and:int(var_3_8CF:int, ldc:int(619690631))
                    goto(Label_1779)
                }
                
                if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_1645)
                }
                
                if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(536870912)), ldc:int(0))) {
                    var_3_8CF = and:int(var_3_8CF:int, ldc:int(898054879))
                }
                else {
                    if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_8CF = and:int(var_3_8CF:int, ldc:int(135166120))
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_8CF = and:int(var_3_8CF:int, ldc:int(1116574066))
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0878)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(1)), ldc:int(0))) {
                        var_3_8CF = and:int(var_3_8CF:int, ldc:int(1419009606))
                        goto(Label_0753)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(16384)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_8CF = and:int(var_3_8CF:int, ldc:int(997471663))
                    var_6_26D = and:int(ldc:int(12597), ldc:int(-13630))
                }
                
                Label_1532:
                
                if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_2080)
                }
                
                if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_1936)
                }
                
                if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_1779)
                }
                
                if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(32)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_8CF = and:int(var_3_8CF:int, ldc:int(1653766844))
                        goto(Label_1384)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_8CF = and:int(var_3_8CF:int, ldc:int(1649133413))
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0878)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0753)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(2)), ldc:int(0))) {
                        var_3_8CF = and:int(var_3_8CF:int, ldc:int(164416267))
                        loopcontinue()
                    }
                    
                    var_3_8CF = and:int(var_3_8CF:int, ldc:int(-60850762))
                    
                    if (cmple:boolean(var_6_26D:int, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ub6ab\u61a4\u12b2\u3776\u9255\u3776, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171))) {
                        if (cmpne:boolean(var_6_26D:int, ldc:int(0))) {
                            goto(Label_1779)
                        }
                        
                        var_5_67 = and:int(ldc:int(-443), ldc:int(314))
                        goto(Label_1936)
                    }
                }
                
                Label_1645:
                
                if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(4096)), ldc:int(0))) {
                    var_3_8CF = and:int(var_3_8CF:int, ldc:int(-957799379))
                    goto(Label_2080)
                }
                
                if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_1936)
                }
                
                if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(4096)), ldc:int(0))) {
                    var_3_8CF = and:int(var_3_8CF:int, ldc:int(1487943918))
                }
                else {
                    if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1532)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1384)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_8CF = and:int(var_3_8CF:int, ldc:int(-287809218))
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0878)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0753)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_8CF = and:int(var_3_8CF:int, ldc:int(1089337775))
                        loopcontinue()
                    }
                    
                    var_3_8CF = and:int(var_3_8CF:int, ldc:int(1029668526))
                    var_6_26D = and:int(ldc:int(27552), ldc:int(-27554))
                    
                    while (cmplt:boolean(var_6_26D:int, ldc:int(64))) {
                        var_8_8C0 = and:int(ldc:int(-26453), ldc:int(25412))
                        
                        loop {
                            if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(268435456)), ldc:int(0))) {
                                var_3_8CF = and:int(var_3_8CF:int, ldc:int(961952998))
                                
                                if (cmplt:boolean(var_8_8C0:int, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ub6ab\u61a4\u12b2\u3776\u9255\u3776, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171))) {
                                    if (logicalor:boolean(cmpgt:boolean(loadelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u4daf\ufcaf\u6fb0\uc238\uc29a\u071d, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), var_8_8C0:int), var_6_26D:int), cmpge:boolean(var_6_26D:int, loadelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u4daf\ufcaf\u6fb0\uc238\uc29a\u071d, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), add:int(var_8_8C0:int, xor:int(ldc:int(610), ldc:int(611))))))) {
                                        var_3_8CF = and:int(var_3_8CF:int, ldc:int(2111681983))
                                        inc:int(var_8_8C0, ldc:int(1))
                                        loopcontinue()
                                    }
                                    
                                    storeelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u8bb0\u7d52\ub1b9\uf995\ud217\u1833, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), var_6_26D:int, var_8_8C0:int)
                                }
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(16384)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                        }
                        
                        var_3_8CF = and:int(var_3_8CF:int, ldc:int(955733931))
                        inc:int(var_6_26D, ldc:int(1))
                    }
                    
                    goto(Label_2080)
                }
                
                Label_1779:
                
                if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(524288)), ldc:int(0))) {
                    var_3_8CF = and:int(var_3_8CF:int, ldc:int(1682905706))
                    goto(Label_2080)
                }
                
                if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(32)), ldc:int(0))) {
                    var_3_8CF = and:int(var_3_8CF:int, ldc:int(251324078))
                }
                else {
                    if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1645)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1532)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1384)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(1)), ldc:int(0))) {
                        var_3_8CF = and:int(var_3_8CF:int, ldc:int(-199775204))
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0878)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0753)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(128)), ldc:int(0))) {
                        var_3_8CF = and:int(var_3_8CF:int, ldc:int(-1966386719))
                        loopcontinue()
                    }
                    
                    var_3_8CF = and:int(var_3_8CF:int, ldc:int(-1116293953))
                    var_5_67 = add:int(var_5_67:int, div:int(sub:int(getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ub6ab\u8c8a\u4c04\u69d9\u7043\u6c52, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), var_5_67:int), sub:int(add:int(getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ub6ab\u61a4\u12b2\u3776\u9255\u3776, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), xor:int(ldc:int(2061), ldc:int(2060))), var_6_26D:int)))
                }
                
                Label_1936:
                
                if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(2147483647)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1779)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_8CF = and:int(var_3_8CF:int, ldc:int(1858539569))
                        goto(Label_1645)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1532)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_8CF = and:int(var_3_8CF:int, ldc:int(-213091388))
                        goto(Label_1384)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(128)), ldc:int(0))) {
                        var_3_8CF = and:int(var_3_8CF:int, ldc:int(-1853632221))
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0878)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0753)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_8CF = and:int(var_3_8CF:int, ldc:int(989673215))
                        storeelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u4daf\ufcaf\u6fb0\uc238\uc29a\u071d, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), var_6_26D:int, loadelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u3776\u120d\uc910\u836c\u600f\uae87, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), and:int(ldc:int(22948), ldc:int(-22949))), var_5_67:int))
                        inc:int(var_6_26D, ldc:int(1))
                        goto(Label_1532)
                    }
                    
                    loopcontinue()
                }
                
                Label_2080:
                
                if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(33554432)), ldc:int(0))) {
                    var_3_8CF = and:int(var_3_8CF:int, ldc:int(-1887581109))
                    goto(Label_1936)
                }
                
                if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_1779)
                }
                
                if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(65536)), ldc:int(0))) {
                    var_3_8CF = and:int(var_3_8CF:int, ldc:int(1973408602))
                    goto(Label_1645)
                }
                
                if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(16384)), ldc:int(0))) {
                    var_3_8CF = and:int(var_3_8CF:int, ldc:int(-517843210))
                    goto(Label_1532)
                }
                
                if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_3_8CF = and:int(var_3_8CF:int, ldc:int(-362004823))
                    goto(Label_1384)
                }
                
                if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(33554432)), ldc:int(0))) {
                    var_3_8CF = and:int(var_3_8CF:int, ldc:int(432514103))
                    goto(Label_1218)
                }
                
                if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_1083)
                }
                
                if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(134217728)), ldc:int(0))) {
                    var_3_8CF = and:int(var_3_8CF:int, ldc:int(-904515221))
                    goto(Label_0878)
                }
                
                if (cmpeq:boolean(and:int(var_3_8CF:int, ldc:int(4194304)), ldc:int(0))) {
                    var_3_8CF = and:int(var_3_8CF:int, ldc:int(-939907268))
                    goto(Label_0753)
                }
                
                if (cmpne:boolean(and:int(var_3_8CF:int, ldc:int(4096)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:int(and:int(ldc:int(-6342), ldc:int(6341)))
        }
        
        return:int(xor:int(ldc:int(6404), ldc:int(6405)))
    }
    
    public static void \u760c\u494c\uc31c\u6d99\u16f6\u965f(\ud36e\u6bb9\u960f\u4c04\u64ab.\u8d90\u156b\u8d90\u718f\uf9c5\ub171 p0) {
        var_1_136 : int
        var_3_D3 : int
        var_4_10B : int[]
        var_5_111 : int[]
        var_6_128 : int
        var_1_44D : int
        var_6_26E : int
        var_7_281 : int
        var_8_339 : float
        var_9_410 : int
        var_10_419 : int
        var_11_422 : int
        var_1_2D1 : int
        var_6_2E1 : int
        
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
        var_1_136 = and:int(ldc:int(1528084259), ldc:int(1322565515))
        storeelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u6198\ud7e8\u647c\u836c\u385b\ud7e8, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), and:int(ldc:int(5402), ldc:int(-5403))), and:int(ldc:int(951), ldc:int(-952)), sub:int(loadelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u3776\u120d\uc910\u836c\u600f\uae87, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), and:int(ldc:int(26659), ldc:int(-27764))), and:int(ldc:int(-9134), ldc:int(9129))), getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u47c2\uafe7\u9af2\u6d99\uc246\u12cb, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171)))
        storeelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u6198\ud7e8\u647c\u836c\u385b\ud7e8, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), and:int(ldc:int(-9125), ldc:int(9124))), and:int(ldc:int(9249), ldc:int(18453)), sub:int(loadelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u3776\u120d\uc910\u836c\u600f\uae87, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), and:int(ldc:int(20528), ldc:int(-20529))), getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ub6ab\u8c8a\u4c04\u69d9\u7043\u6c52, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171)), getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u47c2\uafe7\u9af2\u6d99\uc246\u12cb, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171)))
        storeelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ubb2b\u16f6\u9a18\uc229\u7d52\ubded, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), and:int(ldc:int(-31419), ldc:int(23216)), and:int(ldc:int(24737), ldc:int(1545)))
        var_3_D3 = and:int(ldc:int(1073), ldc:int(65))
        
        loop {
            if (cmpeq:boolean(and:int(var_1_136:int, ldc:int(1)), ldc:int(0))) {
                var_1_136 = and:int(var_1_136:int, ldc:int(-932020859))
            }
            else {
                var_1_136 = and:int(var_1_136:int, ldc:int(-1969256687))
                
                if (cmplt:boolean(var_3_D3:int, xor:int(ldc:int(-24565), ldc:int(-24561)))) {
                    var_4_10B = newarray:int[](int.class, ldc:int(100))
                    var_5_111 = newarray:int[](int.class, ldc:int(64))
                    storeelement:int(var_5_111:int[], and:int(ldc:int(-29243), ldc:int(29234)), getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u47c2\uafe7\u9af2\u6d99\uc246\u12cb, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171))
                    var_6_128 = xor:int(ldc:int(27136), ldc:int(27137))
                    
                    loop {
                        if (cmpne:boolean(and:int(var_1_136:int, ldc:int(8)), ldc:int(0))) {
                            var_1_136 = and:int(var_1_136:int, ldc:int(-1500216677))
                            goto(Label_0558)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_136:int, ldc:int(536870912)), ldc:int(0))) {
                            var_1_136 = and:int(var_1_136:int, ldc:int(521261393))
                            goto(Label_0466)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_136:int, ldc:int(536870912)), ldc:int(0))) {
                            var_1_136 = and:int(var_1_136:int, ldc:int(-1678494316))
                        }
                        else {
                            var_1_136 = and:int(var_1_136:int, ldc:int(-1708085321))
                            
                            if (cmple:boolean(var_6_128:int, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u7330\u67d0\uceb8\u7d52\u67d0\u8413, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171))) {
                                storeelement:int(var_5_111:int[], var_6_128:int, add:int(loadelement:int(var_5_111:int[], sub:int(var_6_128:int, and:int(ldc:int(8197), ldc:int(1)))), loadelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u3d4b\u3bd6\ucb79\u67e9\ud171\u3dd3, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), sub:int(var_6_128:int, and:int(ldc:int(5125), ldc:int(16721))))))
                                inc:int(var_6_128, ldc:int(1))
                                loopcontinue()
                            }
                        }
                        
                        Label_0361:
                        
                        if (cmpne:boolean(and:int(var_1_136:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0558)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_136:int, ldc:int(536870912)), ldc:int(0))) {
                            var_1_136 = and:int(var_1_136:int, ldc:int(2020250026))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_1_136:int, ldc:int(1)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_1_136 = and:int(var_1_136:int, ldc:int(-72249353))
                            var_6_128 = and:int(ldc:int(20587), ldc:int(-29036))
                            
                            while (cmple:boolean(var_6_128:int, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ub6ab\u8c8a\u4c04\u69d9\u7043\u6c52, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171))) {
                                storeelement:int(var_4_10B:int[], var_6_128:int, loadelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u3776\u120d\uc910\u836c\u600f\uae87, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), and:int(ldc:int(4274), ldc:int(-4275))), var_6_128:int))
                                inc:int(var_6_128, ldc:int(1))
                            }
                        }
                        
                        Label_0466:
                        
                        if (cmpeq:boolean(and:int(var_1_136:int, ldc:int(4)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_1_136:int, ldc:int(1)), ldc:int(0))) {
                                goto(Label_0361)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_136:int, ldc:int(512)), ldc:int(0))) {
                                var_1_136 = and:int(var_1_136:int, ldc:int(653421543))
                                loopcontinue()
                            }
                            
                            var_1_136 = and:int(var_1_136:int, ldc:int(1602795463))
                            var_6_128 = xor:int(ldc:int(-31704), ldc:int(-31703))
                            
                            while (cmplt:boolean(var_6_128:int, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u7330\u67d0\uceb8\u7d52\u67d0\u8413, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171))) {
                                storeelement:int(var_4_10B:int[], add:int(var_6_128:int, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ub6ab\u8c8a\u4c04\u69d9\u7043\u6c52, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171)), loadelement:int(var_5_111:int[], var_6_128:int))
                                inc:int(var_6_128, ldc:int(1))
                            }
                        }
                        
                        Label_0558:
                        
                        if (cmpne:boolean(and:int(var_1_136:int, ldc:int(67108864)), ldc:int(0))) {
                            var_1_136 = and:int(var_1_136:int, ldc:int(-307220968))
                            goto(Label_0466)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_136:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0361)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_136:int, ldc:int(131072)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    var_1_44D = and:int(var_1_136:int, ldc:int(-1948743863))
                    invokestatic:void(Arrays::sort, var_4_10B:int[], and:int(ldc:int(9778), ldc:int(-9783)), add:int(getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u7330\u67d0\uceb8\u7d52\u67d0\u8413, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ub6ab\u8c8a\u4c04\u69d9\u7043\u6c52, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171)))
                    var_6_26E = xor:int(ldc:int(8205), ldc:int(8204))
                    var_7_281 = sub:int(add:int(getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u7330\u67d0\uceb8\u7d52\u67d0\u8413, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ub6ab\u8c8a\u4c04\u69d9\u7043\u6c52, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171)), and:int(ldc:int(4611), ldc:int(3189)))
                    
                    if (cmpge:boolean(var_7_281:int, ldc:int(0))) {
                        loop {
                            Label_0648:
                            
                            if (cmpeq:boolean(and:int(var_1_44D:int, ldc:int(2147483647)), ldc:int(0))) {
                                var_1_44D = and:int(var_1_44D:int, ldc:int(-2126025486))
                                goto(Label_0795)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_44D:int, ldc:int(131072)), ldc:int(0))) {
                                var_1_44D = and:int(var_1_44D:int, ldc:int(292064596))
                                goto(Label_0693)
                            }
                            
                            var_1_44D = and:int(var_1_44D:int, ldc:int(-10645627))
                            
                            if (cmpgt:boolean(var_6_26E:int, var_7_281:int)) {
                                goto(Label_0693)
                            }
                            
                            if (cmpeq:boolean(loadelement:int(var_4_10B:int[], sub:int(var_6_26E:int, and:int(ldc:int(1033), ldc:int(977)))), ldc:int(0))) {
                                goto(Label_0795)
                            }
                            
                            var_8_339 = div:float(i2f:float(loadelement:int(var_4_10B:int[], var_6_26E:int)), i2f:float(loadelement:int(var_4_10B:int[], sub:int(var_6_26E:int, xor:int(ldc:int(16896), ldc:int(16897))))))
                            
                            loop {
                                Label_0857:
                                
                                if (cmpeq:boolean(and:int(var_1_44D:int, ldc:int(512)), ldc:int(0))) {
                                    goto(Label_0958)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_44D:int, ldc:int(131072)), ldc:int(0))) {
                                    var_1_44D = and:int(var_1_44D:int, ldc:int(1789167561))
                                    
                                    if (cmplt:boolean(var_8_339:float, loadelement:float(getstatic:float[](\u7049\ub70c\u392e\u93a2\ud12e\u8df4::\u624e\u8c8a\ud36e\u5245\u760c\u36d3), sub:int(var_3_D3:int, and:int(ldc:int(24593), ldc:int(2819)))))) {
                                        if (cmpeq:boolean(loadelement:int(var_4_10B:int[], var_6_26E:int), loadelement:int(var_4_10B:int[], sub:int(var_6_26E:int, xor:int(ldc:int(102), ldc:int(103)))))) {
                                            goto(Label_0958)
                                        }
                                        
                                        var_9_410 = and:int(ldc:int(-10469), ldc:int(10468))
                                        var_10_419 = and:int(ldc:int(-4632), ldc:int(4631))
                                        var_11_422 = and:int(ldc:int(7207), ldc:int(-7208))
                                        
                                        loop {
                                            if (cmpne:boolean(and:int(var_1_44D:int, ldc:int(4)), ldc:int(0))) {
                                                goto(Label_1656)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_1_44D:int, ldc:int(16384)), ldc:int(0))) {
                                                goto(Label_1498)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_1_44D:int, ldc:int(256)), ldc:int(0))) {
                                                goto(Label_1417)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_1_44D:int, ldc:int(134217728)), ldc:int(0))) {
                                                goto(Label_1330)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_1_44D:int, ldc:int(536870912)), ldc:int(0))) {
                                                var_1_44D = and:int(var_1_44D:int, ldc:int(-385361166))
                                                goto(Label_1220)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_1_44D:int, ldc:int(536870912)), ldc:int(0))) {
                                                var_1_44D = and:int(var_1_44D:int, ldc:int(-284696825))
                                                
                                                if (cmple:boolean(var_11_422:int, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u7330\u67d0\uceb8\u7d52\u67d0\u8413, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171))) {
                                                    if (cmpne:boolean(loadelement:int(var_4_10B:int[], var_6_26E:int), loadelement:int(var_5_111:int[], var_11_422:int))) {
                                                        goto(Label_1220)
                                                    }
                                                    
                                                    var_9_410 = xor:int(ldc:int(4248), ldc:int(4249))
                                                    goto(Label_1220)
                                                }
                                            }
                                            
                                            Label_1127:
                                            
                                            if (cmpeq:boolean(and:int(var_1_44D:int, ldc:int(512)), ldc:int(0))) {
                                                var_1_44D = and:int(var_1_44D:int, ldc:int(370372921))
                                                goto(Label_1656)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_1_44D:int, ldc:int(67108864)), ldc:int(0))) {
                                                goto(Label_1498)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_1_44D:int, ldc:int(256)), ldc:int(0))) {
                                                goto(Label_1417)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_1_44D:int, ldc:int(2048)), ldc:int(0))) {
                                                goto(Label_1330)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_1_44D:int, ldc:int(134217728)), ldc:int(0))) {
                                                var_1_44D = and:int(var_1_44D:int, ldc:int(436467496))
                                            }
                                            else {
                                                if (cmpne:boolean(and:int(var_1_44D:int, ldc:int(2048)), ldc:int(0))) {
                                                    loopcontinue()
                                                }
                                                
                                                var_1_44D = and:int(var_1_44D:int, ldc:int(-1442150605))
                                                
                                                if (cmpeq:boolean(var_9_410:int, ldc:int(0))) {
                                                    goto(Label_0958)
                                                }
                                                
                                                var_10_419 = and:int(ldc:int(29474), ldc:int(-30708))
                                                var_11_422 = and:int(ldc:int(-27579), ldc:int(27552))
                                                goto(Label_1330)
                                            }
                                            
                                            Label_1220:
                                            
                                            if (cmpne:boolean(and:int(var_1_44D:int, ldc:int(536870912)), ldc:int(0))) {
                                                var_1_44D = and:int(var_1_44D:int, ldc:int(608611194))
                                                goto(Label_1656)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_1_44D:int, ldc:int(2147483647)), ldc:int(0))) {
                                                var_1_44D = and:int(var_1_44D:int, ldc:int(-1687570543))
                                                goto(Label_1498)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_1_44D:int, ldc:int(131072)), ldc:int(0))) {
                                                goto(Label_1417)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_1_44D:int, ldc:int(134217728)), ldc:int(0))) {
                                                if (cmpne:boolean(and:int(var_1_44D:int, ldc:int(8)), ldc:int(0))) {
                                                    goto(Label_1127)
                                                }
                                                
                                                if (cmpne:boolean(and:int(var_1_44D:int, ldc:int(2147483647)), ldc:int(0))) {
                                                    var_1_44D = and:int(var_1_44D:int, ldc:int(-879589431))
                                                    inc:int(var_11_422, ldc:int(1))
                                                    loopcontinue()
                                                }
                                                
                                                loopcontinue()
                                            }
                                            
                                            Label_1330:
                                            
                                            if (cmpne:boolean(and:int(var_1_44D:int, ldc:int(2048)), ldc:int(0))) {
                                                goto(Label_1656)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_1_44D:int, ldc:int(4)), ldc:int(0))) {
                                                var_1_44D = and:int(var_1_44D:int, ldc:int(1958064971))
                                                goto(Label_1498)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_1_44D:int, ldc:int(16384)), ldc:int(0))) {
                                                if (cmpeq:boolean(and:int(var_1_44D:int, ldc:int(1)), ldc:int(0))) {
                                                    var_1_44D = and:int(var_1_44D:int, ldc:int(532932725))
                                                    goto(Label_1220)
                                                }
                                                
                                                if (cmpeq:boolean(and:int(var_1_44D:int, ldc:int(32768)), ldc:int(0))) {
                                                    var_1_44D = and:int(var_1_44D:int, ldc:int(2042926249))
                                                    goto(Label_1127)
                                                }
                                                
                                                if (cmpne:boolean(and:int(var_1_44D:int, ldc:int(4)), ldc:int(0))) {
                                                    loopcontinue()
                                                }
                                                
                                                var_1_44D = and:int(var_1_44D:int, ldc:int(-563300393))
                                                
                                                if (cmple:boolean(var_11_422:int, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u7330\u67d0\uceb8\u7d52\u67d0\u8413, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171))) {
                                                    if (cmpne:boolean(loadelement:int(var_4_10B:int[], sub:int(var_6_26E:int, and:int(ldc:int(5131), ldc:int(709)))), loadelement:int(var_5_111:int[], var_11_422:int))) {
                                                        goto(Label_1656)
                                                    }
                                                    
                                                    var_10_419 = xor:int(ldc:int(-32446), ldc:int(-32445))
                                                    goto(Label_1656)
                                                }
                                            }
                                            
                                            Label_1417:
                                            
                                            if (cmpeq:boolean(and:int(var_1_44D:int, ldc:int(256)), ldc:int(0))) {
                                                var_1_44D = and:int(var_1_44D:int, ldc:int(-1436819487))
                                                goto(Label_1656)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_1_44D:int, ldc:int(512)), ldc:int(0))) {
                                                var_1_44D = and:int(var_1_44D:int, ldc:int(-1151368445))
                                            }
                                            else {
                                                if (cmpne:boolean(and:int(var_1_44D:int, ldc:int(4)), ldc:int(0))) {
                                                    goto(Label_1330)
                                                }
                                                
                                                if (cmpeq:boolean(and:int(var_1_44D:int, ldc:int(134217728)), ldc:int(0))) {
                                                    goto(Label_1220)
                                                }
                                                
                                                if (cmpne:boolean(and:int(var_1_44D:int, ldc:int(16384)), ldc:int(0))) {
                                                    var_1_44D = and:int(var_1_44D:int, ldc:int(1324532352))
                                                    goto(Label_1127)
                                                }
                                                
                                                if (cmpne:boolean(and:int(var_1_44D:int, ldc:int(536870912)), ldc:int(0))) {
                                                    loopcontinue()
                                                }
                                                
                                                var_1_44D = and:int(var_1_44D:int, ldc:int(-604991719))
                                                
                                                if (cmpne:boolean(var_10_419:int, ldc:int(0))) {
                                                    inc:int(var_6_26E, ldc:int(1))
                                                    looporswitchbreak(Label_0648)
                                                }
                                            }
                                            
                                            Label_1498:
                                            
                                            if (cmpeq:boolean(and:int(var_1_44D:int, ldc:int(536870912)), ldc:int(0))) {
                                                if (cmpeq:boolean(and:int(var_1_44D:int, ldc:int(1)), ldc:int(0))) {
                                                    var_1_44D = and:int(var_1_44D:int, ldc:int(1356028850))
                                                    goto(Label_1417)
                                                }
                                                
                                                if (cmpne:boolean(and:int(var_1_44D:int, ldc:int(131072)), ldc:int(0))) {
                                                    goto(Label_1330)
                                                }
                                                
                                                if (cmpeq:boolean(and:int(var_1_44D:int, ldc:int(33554432)), ldc:int(0))) {
                                                    goto(Label_1220)
                                                }
                                                
                                                if (cmpne:boolean(and:int(var_1_44D:int, ldc:int(8)), ldc:int(0))) {
                                                    var_1_44D = and:int(var_1_44D:int, ldc:int(-535892301))
                                                    goto(Label_1127)
                                                }
                                                
                                                if (cmpeq:boolean(and:int(var_1_44D:int, ldc:int(134217728)), ldc:int(0))) {
                                                    var_1_44D = and:int(var_1_44D:int, ldc:int(2122011202))
                                                    loopcontinue()
                                                }
                                                
                                                var_1_44D = and:int(var_1_44D:int, ldc:int(732530651))
                                                storeelement:int(var_4_10B:int[], sub:int(var_6_26E:int, xor:int(ldc:int(10), ldc:int(11))), loadelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u3776\u120d\uc910\u836c\u600f\uae87, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), and:int(ldc:int(-13445), ldc:int(13444))), getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ub6ab\u8c8a\u4c04\u69d9\u7043\u6c52, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171)))
                                                invokestatic:void(Arrays::sort, var_4_10B:int[], and:int(ldc:int(-2530), ldc:int(2529)), add:int(getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u7330\u67d0\uceb8\u7d52\u67d0\u8413, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ub6ab\u8c8a\u4c04\u69d9\u7043\u6c52, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171)))
                                                inc:int(var_7_281, ldc:int(-1))
                                                looporswitchbreak(Label_0648)
                                            }
                                            
                                            Label_1656:
                                            
                                            if (cmpne:boolean(and:int(var_1_44D:int, ldc:int(4)), ldc:int(0))) {
                                                var_1_44D = and:int(var_1_44D:int, ldc:int(-957445333))
                                                goto(Label_1498)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_1_44D:int, ldc:int(512)), ldc:int(0))) {
                                                var_1_44D = and:int(var_1_44D:int, ldc:int(1534520247))
                                                goto(Label_1417)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_1_44D:int, ldc:int(16384)), ldc:int(0))) {
                                                var_1_44D = and:int(var_1_44D:int, ldc:int(2146095417))
                                                goto(Label_1330)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_1_44D:int, ldc:int(512)), ldc:int(0))) {
                                                var_1_44D = and:int(var_1_44D:int, ldc:int(102219199))
                                                goto(Label_1220)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_1_44D:int, ldc:int(512)), ldc:int(0))) {
                                                goto(Label_1127)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_1_44D:int, ldc:int(512)), ldc:int(0))) {
                                                var_1_44D = and:int(var_1_44D:int, ldc:int(1273286571))
                                                inc:int(var_11_422, ldc:int(1))
                                                goto(Label_1330)
                                            }
                                        }
                                    }
                                }
                                
                                Label_0896:
                                
                                if (cmpne:boolean(and:int(var_1_44D:int, ldc:int(2048)), ldc:int(0))) {
                                    var_1_44D = and:int(var_1_44D:int, ldc:int(1808307191))
                                }
                                else {
                                    if (cmpeq:boolean(and:int(var_1_44D:int, ldc:int(2048)), ldc:int(0))) {
                                        var_1_44D = and:int(var_1_44D:int, ldc:int(1055893417))
                                        inc:int(var_6_26E, ldc:int(1))
                                        looporswitchbreak()
                                    }
                                    
                                    loopcontinue()
                                }
                                
                                Label_0958:
                                
                                if (cmpeq:boolean(and:int(var_1_44D:int, ldc:int(256)), ldc:int(0))) {
                                    goto(Label_0896)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_44D:int, ldc:int(256)), ldc:int(0))) {
                                    var_1_44D = and:int(var_1_44D:int, ldc:int(-4221107))
                                    storeelement:int(var_4_10B:int[], var_6_26E:int, loadelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u3776\u120d\uc910\u836c\u600f\uae87, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), and:int(ldc:int(-22659), ldc:int(22658))), getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ub6ab\u8c8a\u4c04\u69d9\u7043\u6c52, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171)))
                                    invokestatic:void(Arrays::sort, var_4_10B:int[], and:int(ldc:int(18513), ldc:int(-18642)), var_7_281:int)
                                    inc:int(var_7_281, ldc:int(-1))
                                    looporswitchbreak()
                                }
                                
                                var_1_44D = and:int(var_1_44D:int, ldc:int(-1095292824))
                            }
                            
                            loopcontinue()
                            Label_0693:
                            
                            if (cmpeq:boolean(and:int(var_1_44D:int, ldc:int(8)), ldc:int(0))) {
                                if (cmpeq:boolean(and:int(var_1_44D:int, ldc:int(134217728)), ldc:int(0))) {
                                    var_1_44D = and:int(var_1_44D:int, ldc:int(-1905940813))
                                    loopcontinue()
                                }
                                
                                looporswitchbreak()
                            }
                            
                            Label_0795:
                            
                            if (cmpeq:boolean(and:int(var_1_44D:int, ldc:int(2147483647)), ldc:int(0))) {
                                var_1_44D = and:int(var_1_44D:int, ldc:int(1968745710))
                                goto(Label_0693)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_44D:int, ldc:int(32768)), ldc:int(0))) {
                                var_1_44D = and:int(var_1_44D:int, ldc:int(1856278405))
                                var_8_339 = ldc:float(0.0f)
                                goto(Label_0857)
                            }
                        }
                        
                        var_1_2D1 = and:int(var_1_44D:int, ldc:int(196333465))
                        storeelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ubb2b\u16f6\u9a18\uc229\u7d52\ubded, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), var_3_D3:int, var_7_281:int)
                        var_6_2E1 = and:int(ldc:int(-8941), ldc:int(8940))
                        
                        while (cmple:boolean(var_6_2E1:int, var_7_281:int)) {
                            storeelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u6198\ud7e8\u647c\u836c\u385b\ud7e8, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), var_3_D3:int), var_6_2E1:int, sub:int(loadelement:int(var_4_10B:int[], var_6_2E1:int), getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u47c2\uafe7\u9af2\u6d99\uc246\u12cb, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171)))
                            inc:int(var_6_2E1, ldc:int(1))
                        }
                        
                        var_1_136 = and:int(var_1_2D1:int, ldc:int(-904294629))
                        inc:int(var_3_D3, ldc:int(1))
                        loopcontinue()
                    }
                    
                    return:void()
                }
            }
            
            if (cmpne:boolean(and:int(var_1_136:int, ldc:int(512)), ldc:int(0))) {
                return:void()
            }
        }
    }
    
    static {
        expr_64 : int[] [generated]
        expr_D1 : int[][] [generated]
        stack_161_1 : int [generated]
        expr_DE : int[] [generated]
        stack_1EF_1 : int [generated]
        expr_16C : int[] [generated]
        stack_27D_1 : int [generated]
        expr_1FA : int[] [generated]
        stack_30B_1 : int [generated]
        expr_288 : int[] [generated]
        stack_399_1 : int [generated]
        expr_316 : int[] [generated]
        stack_427_1 : int [generated]
        expr_3A4 : int[] [generated]
        stack_4B0_1 : int [generated]
        expr_42D : int[] [generated]
        stack_53E_1 : int [generated]
        expr_4B6 : int[] [generated]
        stack_5D6_1 : int [generated]
        expr_544 : int[] [generated]
        stack_696_1 : int [generated]
        expr_5DC : int[] [generated]
        stack_714_1 : int [generated]
        expr_69C : int[] [generated]
        stack_793_1 : int [generated]
        expr_71A : int[] [generated]
        expr_79E : float[] [generated]
        
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
            expr_64 = newarray:int[](int.class, ldc:int(12))
            storeelement:int(expr_64:int[], and:int(ldc:int(-22601), ldc:int(22600)), ldc:int(13))
            storeelement:int(expr_64:int[], xor:int(ldc:int(768), ldc:int(769)), ldc:int(15))
            storeelement:int(expr_64:int[], xor:int(ldc:int(129), ldc:int(131)), ldc:int(20))
            storeelement:int(expr_64:int[], xor:int(ldc:int(6186), ldc:int(6185)), ldc:int(21))
            storeelement:int(expr_64:int[], and:int(ldc:int(84), ldc:int(12303)), ldc:int(23))
            storeelement:int(expr_64:int[], ldc:int(6), storeelement:int(expr_64:int[], xor:int(ldc:int(9242), ldc:int(9247)), ldc:int(32)))
            storeelement:int(expr_64:int[], ldc:int(7), ldc:int(35))
            storeelement:int(expr_64:int[], ldc:int(8), ldc:int(48))
            storeelement:int(expr_64:int[], ldc:int(9), ldc:int(64))
            storeelement:int(expr_64:int[], ldc:int(10), ldc:int(70))
            storeelement:int(expr_64:int[], ldc:int(11), ldc:int(96))
            putstatic:int[](\u7049\ub70c\u392e\u93a2\ud12e\u8df4::\u97e6\u4975\u1833\u3d64\u3d64\u385b, expr_64:int[])
            expr_D1 = newarray:int[][](int[].class, ldc:int(12))
            stack_161_1 = and:int(ldc:int(19139), ldc:int(-19144))
            expr_DE = newarray:int[](int.class, ldc:int(14))
            storeelement:int(expr_DE:int[], and:int(ldc:int(-3855), ldc:int(3334)), and:int(ldc:int(-5194), ldc:int(5193)))
            storeelement:int(expr_DE:int[], and:int(ldc:int(2817), ldc:int(29895)), xor:int(ldc:int(16641), ldc:int(16643)))
            storeelement:int(expr_DE:int[], xor:int(ldc:int(4629), ldc:int(4631)), xor:int(ldc:int(338), ldc:int(342)))
            storeelement:int(expr_DE:int[], xor:int(ldc:int(83), ldc:int(80)), ldc:int(6))
            storeelement:int(expr_DE:int[], xor:int(ldc:int(8391), ldc:int(8387)), ldc:int(8))
            storeelement:int(expr_DE:int[], xor:int(ldc:int(-31729), ldc:int(-31734)), ldc:int(11))
            storeelement:int(expr_DE:int[], ldc:int(6), ldc:int(14))
            storeelement:int(expr_DE:int[], ldc:int(7), ldc:int(18))
            storeelement:int(expr_DE:int[], ldc:int(8), ldc:int(22))
            storeelement:int(expr_DE:int[], ldc:int(9), ldc:int(26))
            storeelement:int(expr_DE:int[], ldc:int(10), ldc:int(31))
            storeelement:int(expr_DE:int[], ldc:int(11), ldc:int(37))
            storeelement:int(expr_DE:int[], ldc:int(12), ldc:int(44))
            storeelement:int(expr_DE:int[], ldc:int(13), ldc:int(51))
            storeelement:int[](expr_D1:int[][], stack_161_1:int, expr_DE:int[])
            stack_1EF_1 = and:int(ldc:int(2437), ldc:int(8811))
            expr_16C = newarray:int[](int.class, ldc:int(14))
            storeelement:int(expr_16C:int[], and:int(ldc:int(22789), ldc:int(-22790)), and:int(ldc:int(23620), ldc:int(-23621)))
            storeelement:int(expr_16C:int[], and:int(ldc:int(24587), ldc:int(145)), and:int(ldc:int(2114), ldc:int(1282)))
            storeelement:int(expr_16C:int[], xor:int(ldc:int(513), ldc:int(515)), and:int(ldc:int(24711), ldc:int(1556)))
            storeelement:int(expr_16C:int[], and:int(ldc:int(8587), ldc:int(1571)), ldc:int(6))
            storeelement:int(expr_16C:int[], xor:int(ldc:int(-24319), ldc:int(-24315)), ldc:int(8))
            storeelement:int(expr_16C:int[], and:int(ldc:int(10437), ldc:int(565)), ldc:int(11))
            storeelement:int(expr_16C:int[], ldc:int(6), ldc:int(14))
            storeelement:int(expr_16C:int[], ldc:int(7), ldc:int(18))
            storeelement:int(expr_16C:int[], ldc:int(8), ldc:int(22))
            storeelement:int(expr_16C:int[], ldc:int(9), ldc:int(26))
            storeelement:int(expr_16C:int[], ldc:int(10), ldc:int(31))
            storeelement:int(expr_16C:int[], ldc:int(11), ldc:int(36))
            storeelement:int(expr_16C:int[], ldc:int(12), ldc:int(42))
            storeelement:int(expr_16C:int[], ldc:int(13), ldc:int(49))
            storeelement:int[](expr_D1:int[][], stack_1EF_1:int, expr_16C:int[])
            stack_27D_1 = xor:int(ldc:int(16456), ldc:int(16458))
            expr_1FA = newarray:int[](int.class, ldc:int(14))
            storeelement:int(expr_1FA:int[], and:int(ldc:int(6384), ldc:int(-6385)), and:int(ldc:int(-15685), ldc:int(15428)))
            storeelement:int(expr_1FA:int[], xor:int(ldc:int(-16304), ldc:int(-16303)), xor:int(ldc:int(1), ldc:int(3)))
            storeelement:int(expr_1FA:int[], xor:int(ldc:int(2385), ldc:int(2387)), and:int(ldc:int(324), ldc:int(25148)))
            storeelement:int(expr_1FA:int[], xor:int(ldc:int(2), storeelement:int(expr_1FA:int[], xor:int(ldc:int(-27642), ldc:int(-27643)), ldc:int(6))), ldc:int(8))
            storeelement:int(expr_1FA:int[], and:int(ldc:int(2597), ldc:int(28677)), ldc:int(11))
            storeelement:int(expr_1FA:int[], ldc:int(6), ldc:int(14))
            storeelement:int(expr_1FA:int[], ldc:int(7), ldc:int(17))
            storeelement:int(expr_1FA:int[], ldc:int(8), ldc:int(21))
            storeelement:int(expr_1FA:int[], ldc:int(9), ldc:int(25))
            storeelement:int(expr_1FA:int[], ldc:int(10), ldc:int(29))
            storeelement:int(expr_1FA:int[], ldc:int(11), ldc:int(34))
            storeelement:int(expr_1FA:int[], ldc:int(12), ldc:int(39))
            storeelement:int(expr_1FA:int[], ldc:int(13), ldc:int(44))
            storeelement:int[](expr_D1:int[][], stack_27D_1:int, expr_1FA:int[])
            stack_30B_1 = xor:int(ldc:int(6786), ldc:int(6785))
            expr_288 = newarray:int[](int.class, ldc:int(14))
            storeelement:int(expr_288:int[], and:int(ldc:int(-11370), ldc:int(11305)), and:int(ldc:int(19082), ldc:int(-19084)))
            storeelement:int(expr_288:int[], xor:int(ldc:int(8330), ldc:int(8331)), and:int(ldc:int(18859), ldc:int(1030)))
            storeelement:int(expr_288:int[], and:int(ldc:int(1042), ldc:int(26630)), xor:int(ldc:int(260), ldc:int(256)))
            storeelement:int(expr_288:int[], xor:int(ldc:int(1408), ldc:int(1411)), ldc:int(6))
            storeelement:int(expr_288:int[], and:int(ldc:int(38), ldc:int(20749)), ldc:int(8))
            storeelement:int(expr_288:int[], xor:int(ldc:int(13570), ldc:int(13575)), ldc:int(11))
            storeelement:int(expr_288:int[], ldc:int(6), ldc:int(14))
            storeelement:int(expr_288:int[], ldc:int(7), ldc:int(17))
            storeelement:int(expr_288:int[], ldc:int(8), ldc:int(20))
            storeelement:int(expr_288:int[], ldc:int(9), ldc:int(24))
            storeelement:int(expr_288:int[], ldc:int(10), ldc:int(28))
            storeelement:int(expr_288:int[], ldc:int(11), ldc:int(33))
            storeelement:int(expr_288:int[], ldc:int(12), ldc:int(38))
            storeelement:int(expr_288:int[], ldc:int(13), ldc:int(43))
            storeelement:int[](expr_D1:int[][], stack_30B_1:int, expr_288:int[])
            stack_399_1 = xor:int(ldc:int(16448), ldc:int(16452))
            expr_316 = newarray:int[](int.class, ldc:int(14))
            storeelement:int(expr_316:int[], and:int(ldc:int(-9722), ldc:int(1337)), and:int(ldc:int(-9883), ldc:int(9882)))
            storeelement:int(expr_316:int[], and:int(ldc:int(17793), ldc:int(75)), xor:int(ldc:int(600), ldc:int(602)))
            storeelement:int(expr_316:int[], and:int(ldc:int(21523), ldc:int(2338)), and:int(ldc:int(2327), ldc:int(16516)))
            storeelement:int(expr_316:int[], xor:int(ldc:int(2816), ldc:int(2819)), ldc:int(6))
            storeelement:int(expr_316:int[], xor:int(ldc:int(288), ldc:int(292)), ldc:int(8))
            storeelement:int(expr_316:int[], xor:int(ldc:int(2690), ldc:int(2695)), ldc:int(11))
            storeelement:int(expr_316:int[], ldc:int(6), ldc:int(14))
            storeelement:int(expr_316:int[], ldc:int(7), ldc:int(17))
            storeelement:int(expr_316:int[], ldc:int(8), ldc:int(20))
            storeelement:int(expr_316:int[], ldc:int(9), ldc:int(24))
            storeelement:int(expr_316:int[], ldc:int(10), ldc:int(28))
            storeelement:int(expr_316:int[], ldc:int(11), ldc:int(32))
            storeelement:int(expr_316:int[], ldc:int(12), ldc:int(36))
            storeelement:int(expr_316:int[], ldc:int(13), ldc:int(41))
            storeelement:int[](expr_D1:int[][], stack_399_1:int, expr_316:int[])
            stack_427_1 = and:int(ldc:int(14471), ldc:int(16685))
            expr_3A4 = newarray:int[](int.class, ldc:int(14))
            storeelement:int(expr_3A4:int[], and:int(ldc:int(12833), ldc:int(-12834)), and:int(ldc:int(-17228), ldc:int(17227)))
            storeelement:int(expr_3A4:int[], and:int(ldc:int(8859), ldc:int(3169)), xor:int(ldc:int(13057), ldc:int(13059)))
            storeelement:int(expr_3A4:int[], xor:int(ldc:int(16800), ldc:int(16802)), xor:int(ldc:int(9312), ldc:int(9316)))
            storeelement:int(expr_3A4:int[], xor:int(ldc:int(4161), ldc:int(4162)), ldc:int(6))
            storeelement:int(expr_3A4:int[], and:int(ldc:int(2085), ldc:int(26188)), ldc:int(8))
            storeelement:int(expr_3A4:int[], xor:int(ldc:int(-14333), ldc:int(-14330)), ldc:int(10))
            storeelement:int(expr_3A4:int[], ldc:int(6), ldc:int(12))
            storeelement:int(expr_3A4:int[], ldc:int(7), ldc:int(14))
            storeelement:int(expr_3A4:int[], ldc:int(8), ldc:int(17))
            storeelement:int(expr_3A4:int[], ldc:int(9), ldc:int(20))
            storeelement:int(expr_3A4:int[], ldc:int(10), ldc:int(23))
            storeelement:int(expr_3A4:int[], ldc:int(11), ldc:int(26))
            storeelement:int(expr_3A4:int[], ldc:int(12), ldc:int(29))
            storeelement:int(expr_3A4:int[], ldc:int(13), ldc:int(32))
            storeelement:int[](expr_D1:int[][], stack_427_1:int, expr_3A4:int[])
            stack_4B0_1 = ldc:int(6)
            expr_42D = newarray:int[](int.class, ldc:int(14))
            storeelement:int(expr_42D:int[], and:int(ldc:int(13056), ldc:int(-13057)), and:int(ldc:int(-30163), ldc:int(29138)))
            storeelement:int(expr_42D:int[], and:int(ldc:int(19553), ldc:int(151)), xor:int(ldc:int(25216), ldc:int(25218)))
            storeelement:int(expr_42D:int[], and:int(ldc:int(8259), ldc:int(20518)), xor:int(ldc:int(8202), ldc:int(8206)))
            storeelement:int(expr_42D:int[], and:int(ldc:int(275), ldc:int(29703)), ldc:int(6))
            storeelement:int(expr_42D:int[], and:int(ldc:int(6692), ldc:int(204)), ldc:int(8))
            storeelement:int(expr_42D:int[], xor:int(ldc:int(532), ldc:int(529)), ldc:int(10))
            storeelement:int(expr_42D:int[], ldc:int(6), ldc:int(12))
            storeelement:int(expr_42D:int[], ldc:int(7), ldc:int(14))
            storeelement:int(expr_42D:int[], ldc:int(8), ldc:int(17))
            storeelement:int(expr_42D:int[], ldc:int(9), ldc:int(20))
            storeelement:int(expr_42D:int[], ldc:int(10), ldc:int(23))
            storeelement:int(expr_42D:int[], ldc:int(11), ldc:int(26))
            storeelement:int(expr_42D:int[], ldc:int(12), ldc:int(29))
            storeelement:int(expr_42D:int[], ldc:int(13), ldc:int(32))
            storeelement:int[](expr_D1:int[][], stack_4B0_1:int, expr_42D:int[])
            stack_53E_1 = ldc:int(7)
            expr_4B6 = newarray:int[](int.class, ldc:int(14))
            storeelement:int(expr_4B6:int[], and:int(ldc:int(26490), ldc:int(-26491)), and:int(ldc:int(-4570), ldc:int(4569)))
            storeelement:int(expr_4B6:int[], xor:int(ldc:int(-28412), ldc:int(-28411)), xor:int(ldc:int(12418), ldc:int(12419)))
            storeelement:int(expr_4B6:int[], xor:int(ldc:int(4099), ldc:int(4097)), xor:int(ldc:int(18946), ldc:int(18945)))
            storeelement:int(expr_4B6:int[], and:int(ldc:int(16451), ldc:int(5643)), and:int(ldc:int(1605), ldc:int(24711)))
            storeelement:int(expr_4B6:int[], xor:int(ldc:int(-28663), ldc:int(-28659)), ldc:int(7))
            storeelement:int(expr_4B6:int[], xor:int(ldc:int(1281), ldc:int(1284)), ldc:int(9))
            storeelement:int(expr_4B6:int[], ldc:int(6), ldc:int(11))
            storeelement:int(expr_4B6:int[], ldc:int(7), ldc:int(13))
            storeelement:int(expr_4B6:int[], ldc:int(8), ldc:int(15))
            storeelement:int(expr_4B6:int[], ldc:int(9), ldc:int(17))
            storeelement:int(expr_4B6:int[], ldc:int(10), ldc:int(20))
            storeelement:int(expr_4B6:int[], ldc:int(11), ldc:int(23))
            storeelement:int(expr_4B6:int[], ldc:int(12), ldc:int(26))
            storeelement:int(expr_4B6:int[], ldc:int(13), ldc:int(29))
            storeelement:int[](expr_D1:int[][], stack_53E_1:int, expr_4B6:int[])
            stack_5D6_1 = ldc:int(8)
            expr_544 = newarray:int[](int.class, ldc:int(14))
            storeelement:int(expr_544:int[], and:int(ldc:int(8636), ldc:int(-11710)), and:int(ldc:int(9960), ldc:int(-12267)))
            storeelement:int(expr_544:int[], xor:int(ldc:int(2176), ldc:int(2177)), xor:int(ldc:int(4641), ldc:int(4640)))
            storeelement:int(expr_544:int[], and:int(ldc:int(130), ldc:int(74)), and:int(ldc:int(2), ldc:int(10)))
            storeelement:int(expr_544:int[], and:int(ldc:int(16391), ldc:int(15467)), xor:int(ldc:int(1538), ldc:int(1537)))
            storeelement:int(expr_544:int[], and:int(ldc:int(16404), ldc:int(14564)), and:int(ldc:int(10484), ldc:int(1029)))
            storeelement:int(expr_544:int[], and:int(ldc:int(7223), ldc:int(25221)), xor:int(ldc:int(17682), ldc:int(17687)))
            storeelement:int(expr_544:int[], ldc:int(6), ldc:int(6))
            storeelement:int(expr_544:int[], ldc:int(7), ldc:int(7))
            storeelement:int(expr_544:int[], ldc:int(8), ldc:int(8))
            storeelement:int(expr_544:int[], ldc:int(9), ldc:int(9))
            storeelement:int(expr_544:int[], ldc:int(10), ldc:int(10))
            storeelement:int(expr_544:int[], storeelement:int(expr_544:int[], ldc:int(11), ldc:int(12)), ldc:int(14))
            storeelement:int(expr_544:int[], ldc:int(13), ldc:int(16))
            storeelement:int[](expr_D1:int[][], stack_5D6_1:int, expr_544:int[])
            stack_696_1 = ldc:int(9)
            expr_5DC = newarray:int[](int.class, ldc:int(14))
            storeelement:int(expr_5DC:int[], and:int(ldc:int(-18174), ldc:int(18060)), and:int(ldc:int(-1652), ldc:int(1651)))
            storeelement:int(expr_5DC:int[], and:int(ldc:int(145), ldc:int(23373)), and:int(ldc:int(-31790), ldc:int(30733)))
            storeelement:int(expr_5DC:int[], xor:int(ldc:int(-24503), ldc:int(-24501)), and:int(ldc:int(-30133), ldc:int(29744)))
            storeelement:int(expr_5DC:int[], xor:int(ldc:int(-16378), ldc:int(-16379)), and:int(ldc:int(-27448), ldc:int(18711)))
            storeelement:int(expr_5DC:int[], and:int(ldc:int(12868), ldc:int(16518)), and:int(ldc:int(4961), ldc:int(-4962)))
            storeelement:int(expr_5DC:int[], xor:int(ldc:int(545), ldc:int(548)), and:int(ldc:int(-29207), ldc:int(25106)))
            storeelement:int(expr_5DC:int[], ldc:int(6), and:int(ldc:int(405), ldc:int(-4510)))
            storeelement:int(expr_5DC:int[], ldc:int(7), and:int(ldc:int(-20017), ldc:int(20016)))
            storeelement:int(expr_5DC:int[], ldc:int(8), and:int(ldc:int(16168), ldc:int(-16169)))
            storeelement:int(expr_5DC:int[], ldc:int(9), and:int(ldc:int(-21249), ldc:int(21248)))
            storeelement:int(expr_5DC:int[], ldc:int(10), and:int(ldc:int(-11463), ldc:int(11334)))
            storeelement:int(expr_5DC:int[], ldc:int(11), and:int(ldc:int(24926), ldc:int(-24928)))
            storeelement:int(expr_5DC:int[], ldc:int(12), and:int(ldc:int(24801), ldc:int(-24818)))
            storeelement:int(expr_5DC:int[], ldc:int(13), and:int(ldc:int(-5455), ldc:int(5386)))
            storeelement:int[](expr_D1:int[][], stack_696_1:int, expr_5DC:int[])
            stack_714_1 = ldc:int(10)
            expr_69C = newarray:int[](int.class, ldc:int(14))
            storeelement:int(expr_69C:int[], and:int(ldc:int(4994), ldc:int(-7043)), and:int(ldc:int(18009), ldc:int(-26618)))
            storeelement:int(expr_69C:int[], xor:int(ldc:int(4104), ldc:int(4105)), ldc:int(-1))
            storeelement:int(expr_69C:int[], and:int(ldc:int(8834), ldc:int(5454)), ldc:int(-2))
            storeelement:int(expr_69C:int[], and:int(ldc:int(2819), ldc:int(17491)), ldc:int(-3))
            storeelement:int(expr_69C:int[], and:int(ldc:int(916), ldc:int(25645)), ldc:int(-4))
            storeelement:int(expr_69C:int[], and:int(ldc:int(16645), ldc:int(13455)), ldc:int(-5))
            storeelement:int(expr_69C:int[], ldc:int(7), storeelement:int(expr_69C:int[], ldc:int(6), ldc:int(-6)))
            storeelement:int(expr_69C:int[], ldc:int(9), storeelement:int(expr_69C:int[], ldc:int(8), ldc:int(-6)))
            storeelement:int(expr_69C:int[], ldc:int(11), storeelement:int(expr_69C:int[], ldc:int(10), ldc:int(-6)))
            storeelement:int(expr_69C:int[], ldc:int(13), storeelement:int(expr_69C:int[], ldc:int(12), ldc:int(-6)))
            storeelement:int[](expr_D1:int[][], stack_714_1:int, expr_69C:int[])
            stack_793_1 = ldc:int(11)
            expr_71A = newarray:int[](int.class, ldc:int(14))
            storeelement:int(expr_71A:int[], and:int(ldc:int(-12553), ldc:int(12552)), and:int(ldc:int(14344), ldc:int(-14345)))
            storeelement:int(expr_71A:int[], xor:int(ldc:int(288), ldc:int(289)), ldc:int(-3))
            storeelement:int(expr_71A:int[], xor:int(ldc:int(4608), ldc:int(4610)), ldc:int(-6))
            storeelement:int(expr_71A:int[], xor:int(ldc:int(-11776), ldc:int(-11773)), ldc:int(-9))
            storeelement:int(expr_71A:int[], and:int(ldc:int(28772), ldc:int(2070)), ldc:int(-12))
            storeelement:int(expr_71A:int[], xor:int(ldc:int(18565), ldc:int(18560)), ldc:int(-15))
            storeelement:int(expr_71A:int[], ldc:int(6), ldc:int(-18))
            storeelement:int(expr_71A:int[], ldc:int(7), ldc:int(-20))
            storeelement:int(expr_71A:int[], ldc:int(8), ldc:int(-22))
            storeelement:int(expr_71A:int[], ldc:int(9), ldc:int(-24))
            storeelement:int(expr_71A:int[], ldc:int(10), ldc:int(-26))
            storeelement:int(expr_71A:int[], ldc:int(11), ldc:int(-28))
            storeelement:int(expr_71A:int[], ldc:int(12), ldc:int(-30))
            storeelement:int(expr_71A:int[], ldc:int(13), ldc:int(-32))
            storeelement:int[](expr_D1:int[][], stack_793_1:int, expr_71A:int[])
            putstatic:int[][](\u7049\ub70c\u392e\u93a2\ud12e\u8df4::\u527a\u6bb9\u7ce1\u759a\u983f\u71f1, expr_D1:int[][])
            expr_79E = newarray:float[](float.class, and:int(ldc:int(5251), ldc:int(23)))
            storeelement:float(expr_79E:float[], and:int(ldc:int(17610), ldc:int(-17615)), ldc:float(1.327152f))
            storeelement:float(expr_79E:float[], and:int(ldc:int(137), ldc:int(16451)), ldc:float(1.185093f))
            storeelement:float(expr_79E:float[], and:int(ldc:int(18946), ldc:int(5506)), ldc:float(1.119872f))
            putstatic:float[](\u7049\ub70c\u392e\u93a2\ud12e\u8df4::\u624e\u8c8a\ud36e\u5245\u760c\u36d3, expr_79E:float[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u36d3\u3bc9\ub19c\u3711\u5bc4\ud7e8(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_64E : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_BD : double
        var_3_CF : int
        var_11_E0 : int
        var_14_10A : double
        var_16_10E : int
        var_12_106 : double
        var_17_659 : int
        
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
        var_3_64E = and:int(ldc:int(-192515697), ldc:int(-158435857))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7049\ub70c\u392e\u93a2\ud12e\u8df4[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(16384)), ldc:int(0))) {
            var_3_64E = and:int(var_3_64E:int, ldc:int(-33660929))
            var_5_80 = and:int(ldc:int(-26199), ldc:int(26134))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-120), ldc:int(119)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BD = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CF = and:int(var_3_64E:int, ldc:int(-55060066))
                    var_9_BD = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E0 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E0:int, sub:int(var_6_87:int, xor:int(ldc:int(-32736), ldc:int(-32735)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E0:int, and:int(ldc:int(2113), ldc:int(1027)))), var_7_96:double))) {
                        inc:int(var_11_E0, ldc:int(1))
                    }
                    
                    var_3_64E = and:int(var_3_CF:int, ldc:int(-167880801))
                    var_14_10A = var_7_96:double
                    var_16_10E = var_11_E0:int
                }
                else {
                    var_11_E0 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), and:int(ldc:int(4609), ldc:int(16641)))
                    var_12_106 = var_14_10A = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_10E = var_11_E0:int, var_6_87:int)) {
                        var_9_BD = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E0:int)
                        var_16_10E = var_11_E0:int
                        var_14_10A = var_12_106:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(432367103))
                        goto(Label_1499)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1337)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(1136022440))
                        goto(Label_1200)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0939)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(44540124))
                        goto(Label_0831)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(16)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-605312763))
                        goto(Label_0690)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(8)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1381913036))
                        goto(Label_0562)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-22162513))
                        
                        if (cmplt:boolean(var_16_10E:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0562)
                            }
                            
                            goto(Label_0831)
                        }
                    }
                    
                    Label_0403:
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1499)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1337)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1200)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(822972680))
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0939)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(1963262876))
                        goto(Label_0831)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(128)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-2054093892))
                        goto(Label_0690)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-151930727))
                            loopcontinue()
                        }
                        
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-188752961))
                        var_11_E0 = and:int(ldc:int(-25516), ldc:int(25001))
                        goto(Label_1488)
                    }
                    
                    Label_0562:
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1367259840))
                        goto(Label_1499)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1337)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1200)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(120848501))
                        goto(Label_0939)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1975598223))
                        goto(Label_0831)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-197417226))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(32)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(1429380222))
                            goto(Label_0403)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-140226081))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10A = var_9_BD:double
                            goto(Label_0831)
                        }
                    }
                    
                    Label_0690:
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(18338633))
                        goto(Label_1499)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(64)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-63124455))
                        goto(Label_1337)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(1346585905))
                        goto(Label_1200)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(965408930))
                        goto(Label_0939)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-1992841704))
                            goto(Label_0562)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0403)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-28130850))
                            loopcontinue()
                        }
                        
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-167880737))
                        var_14_10A = mul:double(ldc:double(0.5), add:double(var_9_BD:double, var_14_10A:double))
                    }
                    
                    Label_0831:
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1499)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1337)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(64)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1277440571))
                        goto(Label_1200)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-368034086))
                            goto(Label_0690)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0562)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-1499081207))
                            goto(Label_0403)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-36349554))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E0 = xor:int(ldc:int(-28096), ldc:int(-28095))
                                goto(Label_1101)
                            }
                        }
                    }
                    
                    Label_0939:
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(1933013560))
                        goto(Label_1499)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1337)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1200)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(128)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-772373914))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0831)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(256)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-678071182))
                            goto(Label_0690)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(256)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-867152873))
                            goto(Label_0562)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(1449513758))
                            goto(Label_0403)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-55781409))
                        var_11_E0 = and:int(ldc:int(-25146), ldc:int(25145))
                    }
                    
                    Label_1101:
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1499)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1823940610))
                        goto(Label_1337)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0939)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0831)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0690)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-745787173))
                            goto(Label_0562)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0403)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-155951185))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E0:int, ldc:int(0))) {
                                goto(Label_1337)
                            }
                        }
                    }
                    
                    Label_1200:
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-2055936284))
                        goto(Label_1499)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1808359271))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(256)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(1625450507))
                            goto(Label_1101)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0939)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0831)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0690)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0562)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-1055445228))
                            goto(Label_0403)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(1931000007))
                            loopcontinue()
                        }
                        
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-54012449))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10A:double, var_5_80:int, var_16_10E:int)
                        goto(Label_1488)
                    }
                    
                    Label_1337:
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1499)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-172282781))
                        goto(Label_1200)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1289558224))
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1031808092))
                        goto(Label_0939)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0831)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0690)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1596772916))
                        goto(Label_0562)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(64)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1092562559))
                        goto(Label_0403)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(2014711633))
                        loopcontinue()
                    }
                    
                    var_3_64E = and:int(var_3_64E:int, ldc:int(-34080866))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10A:double, ldc:double(0.0))
                    Label_1488:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_659 = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E0:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1499:
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1337)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(128)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(807808867))
                        goto(Label_1200)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(79002666))
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(8)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(1187421591))
                        goto(Label_0939)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0831)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(648275783))
                        goto(Label_0690)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0562)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0403)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-18549841))
                        var_17_659 = add:int(var_16_10E:int, xor:int(ldc:int(8217), ldc:int(8216)))
                        looporswitchbreak()
                    }
                    
                    var_3_64E = and:int(var_3_64E:int, ldc:int(378945416))
                }
                
                var_3_64E = and:int(var_3_64E:int, ldc:int(-3320370))
                
                if (cmple:boolean(var_5_80 = var_17_659:int, sub:int(var_6_87:int, and:int(ldc:int(3873), ldc:int(4161))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(524288)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
