public class \u6cfe\u16f6\u4c04\u61a4\u8bb0.\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523 {
    public void \uae5d\u7006\uc3e3\u4f52\u3d4b\ud523(java.io.DataInputStream p0) {
        var_4_C0 : int
        var_4_90 : int
        
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
            invokespecial:Object(Object::<init>, this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523)
            invokespecial:void(\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\u4492\u92ee\ubefe\uc229\u8d98\u5bc4, this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523, p0:DataInputStream)
            
            if (logicalnot:boolean(getfield:boolean(\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\uc4d2\uceb8\uc9f6\u8cae\u51fa\u8c8a, this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523))) {
                putfield:int(\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\u183a\u4c2b\u8bb0\uf94d\u946b\u8258, this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523, invokevirtual:int(DataInputStream::readUnsignedShort, p0:DataInputStream))
            }
            
            if (cmpne:boolean(getfield:int(\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\u3dd3\ud217\u61a4\u3bc9\u385b\u67e9, this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523), ldc:int(0))) {
                if (logicalnot:boolean(getfield:boolean(\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\uc4d2\uceb8\uc9f6\u8cae\u51fa\u8c8a, this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523))) {
                    putfield:int[](\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\u446c\u446c\u4cd9\u7d52\u69d9\u92ff, this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523, newarray:int[](int.class, getfield:int(\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\u3dd3\ud217\u61a4\u3bc9\u385b\u67e9, this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523)))
                    var_4_C0 = and:int(ldc:int(5145), ldc:int(-7966))
                    
                    while (cmplt:boolean(var_4_C0:int, getfield:int(\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\u3dd3\ud217\u61a4\u3bc9\u385b\u67e9, this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523))) {
                        storeelement:int(getfield:int[](\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\u446c\u446c\u4cd9\u7d52\u69d9\u92ff, this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523), var_4_C0:int, invokevirtual:int(DataInputStream::readUnsignedShort, p0:DataInputStream))
                        inc:int(var_4_C0, ldc:int(1))
                    }
                    
                    putfield:int(\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\u183a\u4c2b\u8bb0\uf94d\u946b\u8258, this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523, invokevirtual:int(DataInputStream::readUnsignedShort, p0:DataInputStream))
                }
                
                var_4_90 = and:int(ldc:int(4219), ldc:int(-6400))
                
                while (cmplt:boolean(var_4_90:int, getfield:int(\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\u3dd3\ud217\u61a4\u3bc9\u385b\u67e9, this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523))) {
                    if (logicalnot:boolean(getfield:boolean(\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\uc4d2\uceb8\uc9f6\u8cae\u51fa\u8c8a, this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523))) {
                        putfield:int(\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\u183a\u4c2b\u8bb0\uf94d\u946b\u8258, this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523, invokevirtual:int(DataInputStream::readUnsignedShort, p0:DataInputStream))
                    }
                    
                    inc:int(var_4_90, ldc:int(1))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u4492\u92ee\ubefe\uc229\u8d98\u5bc4(java.io.DataInputStream p0) {
        var_2_577 : int
        var_4_64 : int
        stack_592_0 : \uae5d\u7006\uc3e3\u4f52\u3d4b\ud523 [generated]
        stack_511_0 : \uae5d\u7006\uc3e3\u4f52\u3d4b\ud523 [generated]
        stack_465_0 : \uae5d\u7006\uc3e3\u4f52\u3d4b\ud523 [generated]
        stack_3A1_0 : \uae5d\u7006\uc3e3\u4f52\u3d4b\ud523 [generated]
        stack_2BD_0 : \uae5d\u7006\uc3e3\u4f52\u3d4b\ud523 [generated]
        stack_1D9_0 : \uae5d\u7006\uc3e3\u4f52\u3d4b\ud523 [generated]
        stack_10F_0 : \uae5d\u7006\uc3e3\u4f52\u3d4b\ud523 [generated]
        stack_1D9_1 : boolean [generated]
        stack_10F_1 : boolean [generated]
        stack_2BD_1 : boolean [generated]
        stack_3A1_1 : int [generated]
        stack_465_1 : int [generated]
        stack_511_1 : int [generated]
        stack_592_1 : int [generated]
        var_4_59F : int
        var_4_5C1 : int
        
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
            var_2_577 = and:int(ldc:int(-40111185), ldc:int(-237267490))
            var_4_64 = invokevirtual:int(FilterInputStream::read, p0:DataInputStream[expected:FilterInputStream])
            stack_592_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            stack_511_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            stack_465_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            stack_3A1_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            stack_2BD_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            stack_1D9_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            stack_10F_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            
            if (cmpeq:boolean(and:int(shr:int(var_4_64:int, and:int(ldc:int(67), ldc:int(1419))), and:int(ldc:int(25123), ldc:int(4113))), and:int(ldc:int(4289), ldc:int(16417)))) {
                stack_1D9_1 = stack_10F_1 = stack_2BD_1 = stack_3A1_1 = stack_465_1 = stack_511_1 = xor(ldc(24836), ldc(24837))
                goto(Label_0207)
            }
            
            Label_0131:
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_1329)
            }
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_1157)
            }
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0961)
            }
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(8388608)), ldc:int(0))) {
                var_2_577 = and:int(var_2_577:int, ldc:int(-2007048177))
                goto(Label_0757)
            }
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0553)
            }
            
            if (cmpne:boolean(and:int(var_2_577:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0317)
            }
            
            var_2_577 = and:int(var_2_577:int, ldc:int(-235737921))
            stack_1D9_1 = stack_10F_1 = stack_2BD_1 = stack_3A1_1 = stack_465_1 = stack_511_1 = and(ldc(8287), ldc(-26464))
            Label_0207:
            
            if (cmpne:boolean(and:int(var_2_577:int, ldc:int(2048)), ldc:int(0))) {
                var_2_577 = and:int(var_2_577:int, ldc:int(-566965430))
                goto(Label_1249)
            }
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(8388608)), ldc:int(0))) {
                var_2_577 = and:int(var_2_577:int, ldc:int(-733196540))
                goto(Label_1061)
            }
            
            if (cmpne:boolean(and:int(var_2_577:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0857)
            }
            
            if (cmpne:boolean(and:int(var_2_577:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0645)
            }
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(2147483647)), ldc:int(0))) {
                var_2_577 = and:int(var_2_577:int, ldc:int(799482460))
                goto(Label_0401)
            }
            
            var_2_577 = and:int(var_2_577:int, ldc:int(-239429138))
            putfield:boolean(\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\u0b8e\u7006\u983f\u6435\u1833\u71ae, stack_10F_0:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523, stack_10F_1:boolean)
            putfield:int(\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\u56bd\u97b7\ub6ab\u92ee\u71ae\ua3b4, this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523, and:int(shr:int(var_4_64:int, xor:int(ldc:int(-32724), ldc:int(-32723))), xor:int(ldc:int(16532), ldc:int(16535))))
            stack_592_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            stack_511_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            stack_465_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            stack_3A1_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            stack_2BD_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            stack_1D9_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            stack_10F_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            
            if (cmpeq:boolean(and:int(var_4_64:int, xor:int(ldc:int(1152), ldc:int(1153))), xor:int(ldc:int(12432), ldc:int(12433)))) {
                stack_1D9_1 = stack_10F_1 = stack_2BD_1 = stack_3A1_1 = stack_465_1 = stack_511_1 = and(ldc(9), ldc(9601))
                goto(Label_0401)
            }
            
            Label_0317:
            
            if (cmpne:boolean(and:int(var_2_577:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_1329)
            }
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_1157)
            }
            
            if (cmpne:boolean(and:int(var_2_577:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0961)
            }
            
            if (cmpne:boolean(and:int(var_2_577:int, ldc:int(2048)), ldc:int(0))) {
                var_2_577 = and:int(var_2_577:int, ldc:int(494094809))
                goto(Label_0757)
            }
            
            if (cmpne:boolean(and:int(var_2_577:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0553)
            }
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(2147483647)), ldc:int(0))) {
                var_2_577 = and:int(var_2_577:int, ldc:int(1759663882))
                goto(Label_0131)
            }
            
            var_2_577 = and:int(var_2_577:int, ldc:int(-206111026))
            stack_1D9_1 = stack_10F_1 = stack_2BD_1 = stack_3A1_1 = stack_465_1 = stack_511_1 = and(ldc(1820), ldc(-10013))
            Label_0401:
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(2147483647)), ldc:int(0))) {
                var_2_577 = and:int(var_2_577:int, ldc:int(-555225735))
                goto(Label_1249)
            }
            
            if (cmpne:boolean(and:int(var_2_577:int, ldc:int(33554432)), ldc:int(0))) {
                var_2_577 = and:int(var_2_577:int, ldc:int(-308783008))
                goto(Label_1061)
            }
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(2147483647)), ldc:int(0))) {
                var_2_577 = and:int(var_2_577:int, ldc:int(-796847052))
                goto(Label_0857)
            }
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(4)), ldc:int(0))) {
                var_2_577 = and:int(var_2_577:int, ldc:int(2128393093))
                goto(Label_0645)
            }
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0207)
            }
            
            var_2_577 = and:int(var_2_577:int, ldc:int(-789602))
            putfield:boolean(\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\uc4d2\uceb8\uc9f6\u8cae\u51fa\u8c8a, stack_1D9_0:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523, stack_1D9_1:boolean)
            var_4_64 = invokevirtual:int(FilterInputStream::read, p0:DataInputStream[expected:FilterInputStream])
            putfield:int(\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\ud523\uae5d\u47c2\u836c\uae5d\ua61f, this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523, add:int(and:int(shr:int(var_4_64:int, ldc:int(6)), and:int(ldc:int(25127), ldc:int(3075))), xor:int(ldc:int(114), ldc:int(115))))
            putfield:int(\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\u3bc9\u759a\uc910\u3d64\u960f\u47c2, this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523, and:int(shr:int(var_4_64:int, and:int(ldc:int(2), ldc:int(4099))), ldc:int(15)))
            stack_592_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            stack_511_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            stack_465_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            stack_3A1_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            stack_2BD_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            stack_1D9_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            stack_10F_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            
            if (cmpeq:boolean(and:int(shr:int(var_4_64:int, and:int(ldc:int(2831), ldc:int(16385))), and:int(ldc:int(641), ldc:int(3073))), and:int(ldc:int(10371), ldc:int(1861)))) {
                stack_1D9_1 = stack_10F_1 = stack_2BD_1 = stack_3A1_1 = stack_465_1 = stack_511_1 = xor(ldc(768), ldc(769))
                goto(Label_0645)
            }
            
            Label_0553:
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(16777216)), ldc:int(0))) {
                var_2_577 = and:int(var_2_577:int, ldc:int(1060934698))
                goto(Label_1329)
            }
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_1157)
            }
            
            if (cmpne:boolean(and:int(var_2_577:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0961)
            }
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0757)
            }
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(8388608)), ldc:int(0))) {
                var_2_577 = and:int(var_2_577:int, ldc:int(-814398036))
                goto(Label_0317)
            }
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(4)), ldc:int(0))) {
                var_2_577 = and:int(var_2_577:int, ldc:int(1617814733))
                goto(Label_0131)
            }
            
            var_2_577 = and:int(var_2_577:int, ldc:int(-103638042))
            stack_1D9_1 = stack_10F_1 = stack_2BD_1 = stack_3A1_1 = stack_465_1 = stack_511_1 = and(ldc(-9796), ldc(9731))
            Label_0645:
            
            if (cmpne:boolean(and:int(var_2_577:int, ldc:int(2097152)), ldc:int(0))) {
                var_2_577 = and:int(var_2_577:int, ldc:int(1135084771))
                goto(Label_1249)
            }
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(2)), ldc:int(0))) {
                var_2_577 = and:int(var_2_577:int, ldc:int(1228452808))
                goto(Label_1061)
            }
            
            if (cmpne:boolean(and:int(var_2_577:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0857)
            }
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0401)
            }
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0207)
            }
            
            var_2_577 = and:int(var_2_577:int, ldc:int(-337931826))
            putfield:boolean(\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\u3711\ubf56\uff55\u7bad\ud158\ud171, stack_2BD_0:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523, stack_2BD_1:boolean)
            var_4_64 = or:int(shl:int(var_4_64:int, ldc:int(8)), invokevirtual:int(FilterInputStream::read, p0:DataInputStream[expected:FilterInputStream]))
            putfield:int(\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\ubf56\ucef1\u836c\uf94d\ub19c\ud171, this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523, and:int(shr:int(var_4_64:int, ldc:int(6)), ldc:int(7)))
            stack_592_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            stack_511_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            stack_465_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            stack_3A1_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            stack_2BD_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            stack_1D9_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            stack_10F_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            
            if (cmpeq:boolean(and:int(shr:int(var_4_64:int, xor:int(ldc:int(259), ldc:int(262))), xor:int(ldc:int(-28672), ldc:int(-28671))), and:int(ldc:int(4641), ldc:int(9217)))) {
                stack_1D9_1 = stack_10F_1 = stack_2BD_1 = stack_3A1_1 = stack_465_1 = stack_511_1 = and(ldc(22929), ldc(585))
                goto(Label_0857)
            }
            
            Label_0757:
            
            if (cmpne:boolean(and:int(var_2_577:int, ldc:int(4194304)), ldc:int(0))) {
                var_2_577 = and:int(var_2_577:int, ldc:int(1269334825))
                goto(Label_1329)
            }
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_1157)
            }
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0961)
            }
            
            if (cmpne:boolean(and:int(var_2_577:int, ldc:int(2097152)), ldc:int(0))) {
                var_2_577 = and:int(var_2_577:int, ldc:int(471678732))
                goto(Label_0553)
            }
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(2)), ldc:int(0))) {
                var_2_577 = and:int(var_2_577:int, ldc:int(-797203701))
                goto(Label_0317)
            }
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(8388608)), ldc:int(0))) {
                var_2_577 = and:int(var_2_577:int, ldc:int(-2122155757))
                goto(Label_0131)
            }
            
            var_2_577 = and:int(var_2_577:int, ldc:int(-474312202))
            stack_1D9_1 = stack_10F_1 = stack_2BD_1 = stack_3A1_1 = stack_465_1 = stack_511_1 = and(ldc(12445), ldc(-15550))
            Label_0857:
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(2)), ldc:int(0))) {
                var_2_577 = and:int(var_2_577:int, ldc:int(2079869387))
                goto(Label_1249)
            }
            
            if (cmpne:boolean(and:int(var_2_577:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_1061)
            }
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(4)), ldc:int(0))) {
                var_2_577 = and:int(var_2_577:int, ldc:int(690192668))
                goto(Label_0645)
            }
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(128)), ldc:int(0))) {
                var_2_577 = and:int(var_2_577:int, ldc:int(-424204610))
                goto(Label_0401)
            }
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(32768)), ldc:int(0))) {
                var_2_577 = and:int(var_2_577:int, ldc:int(774017998))
                goto(Label_0207)
            }
            
            var_2_577 = and:int(var_2_577:int, ldc:int(-304946009))
            putfield:boolean(\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\u946b\u56bd\u71ae\u67d0\u3776\u5fe1, stack_3A1_0:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523, stack_3A1_1:boolean)
            stack_592_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            stack_511_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            stack_465_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            stack_3A1_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            stack_2BD_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            stack_1D9_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            stack_10F_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            
            if (cmpeq:boolean(and:int(shr:int(var_4_64:int, and:int(ldc:int(18342), ldc:int(12))), xor:int(ldc:int(16385), ldc:int(16384))), and:int(ldc:int(17595), ldc:int(5)))) {
                stack_1D9_1 = stack_10F_1 = stack_2BD_1 = stack_3A1_1 = stack_465_1 = stack_511_1 = and(ldc(129), ldc(12305))
                goto(Label_1061)
            }
            
            Label_0961:
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(1073741824)), ldc:int(0))) {
                var_2_577 = and:int(var_2_577:int, ldc:int(557017159))
                goto(Label_1329)
            }
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(8388608)), ldc:int(0))) {
                var_2_577 = and:int(var_2_577:int, ldc:int(278013748))
                goto(Label_1157)
            }
            
            if (cmpne:boolean(and:int(var_2_577:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0757)
            }
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0553)
            }
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(16777216)), ldc:int(0))) {
                var_2_577 = and:int(var_2_577:int, ldc:int(900960444))
                goto(Label_0317)
            }
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(4)), ldc:int(0))) {
                var_2_577 = and:int(var_2_577:int, ldc:int(1008604086))
                goto(Label_0131)
            }
            
            var_2_577 = and:int(var_2_577:int, ldc:int(-409750530))
            stack_1D9_1 = stack_10F_1 = stack_2BD_1 = stack_3A1_1 = stack_465_1 = stack_511_1 = and(ldc(-3929), ldc(3928))
            Label_1061:
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(131072)), ldc:int(0))) {
                var_2_577 = and:int(var_2_577:int, ldc:int(1550340153))
                goto(Label_1249)
            }
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0857)
            }
            
            if (cmpne:boolean(and:int(var_2_577:int, ldc:int(2097152)), ldc:int(0))) {
                var_2_577 = and:int(var_2_577:int, ldc:int(-1529647954))
                goto(Label_0645)
            }
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(1048576)), ldc:int(0))) {
                var_2_577 = and:int(var_2_577:int, ldc:int(1739555756))
                goto(Label_0401)
            }
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0207)
            }
            
            var_2_577 = and:int(var_2_577:int, ldc:int(-443117585))
            putfield:boolean(\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\u4e72\uae5d\ub83f\u47c2\u0800\uc229, stack_465_0:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523, stack_465_1:boolean)
            stack_592_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            stack_511_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            stack_465_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            stack_3A1_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            stack_2BD_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            stack_1D9_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            stack_10F_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            
            if (cmpeq:boolean(and:int(shr:int(var_4_64:int, and:int(ldc:int(1571), ldc:int(2179))), xor:int(ldc:int(18704), ldc:int(18705))), and:int(ldc:int(8237), ldc:int(21649)))) {
                stack_1D9_1 = stack_10F_1 = stack_2BD_1 = stack_3A1_1 = stack_465_1 = stack_511_1 = xor(ldc(-30686), ldc(-30685))
                goto(Label_1249)
            }
            
            Label_1157:
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_1329)
            }
            
            if (cmpne:boolean(and:int(var_2_577:int, ldc:int(4194304)), ldc:int(0))) {
                var_2_577 = and:int(var_2_577:int, ldc:int(367316976))
                goto(Label_0961)
            }
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0757)
            }
            
            if (cmpne:boolean(and:int(var_2_577:int, ldc:int(4194304)), ldc:int(0))) {
                var_2_577 = and:int(var_2_577:int, ldc:int(-439763145))
                goto(Label_0553)
            }
            
            if (cmpne:boolean(and:int(var_2_577:int, ldc:int(2048)), ldc:int(0))) {
                var_2_577 = and:int(var_2_577:int, ldc:int(-1255855364))
                goto(Label_0317)
            }
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0131)
            }
            
            var_2_577 = and:int(var_2_577:int, ldc:int(-174132585))
            stack_1D9_1 = stack_10F_1 = stack_2BD_1 = stack_3A1_1 = stack_465_1 = stack_511_1 = and(ldc(7498), ldc(-23884))
            Label_1249:
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_1061)
            }
            
            if (cmpne:boolean(and:int(var_2_577:int, ldc:int(4194304)), ldc:int(0))) {
                var_2_577 = and:int(var_2_577:int, ldc:int(-712853932))
                goto(Label_0857)
            }
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_0645)
            }
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0401)
            }
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0207)
            }
            
            var_2_577 = and:int(var_2_577:int, ldc:int(-104948273))
            putfield:boolean(\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\ua068\ua068\u385b\uf94d\u120d\u8413, stack_511_0:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523, stack_511_1:boolean)
            stack_592_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            stack_511_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            stack_465_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            stack_3A1_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            stack_2BD_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            stack_1D9_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            stack_10F_0 = this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523
            
            if (cmpeq:boolean(and:int(shr:int(var_4_64:int, xor:int(ldc:int(1), ldc:int(3))), and:int(ldc:int(18565), ldc:int(321))), xor:int(ldc:int(660), ldc:int(661)))) {
                stack_592_1 = and:int(ldc:int(26673), ldc:int(1547))
                goto(Label_1421)
            }
            
            Label_1329:
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_1157)
            }
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_0961)
            }
            
            if (cmpne:boolean(and:int(var_2_577:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0757)
            }
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(32768)), ldc:int(0))) {
                var_2_577 = and:int(var_2_577:int, ldc:int(1258578511))
                goto(Label_0553)
            }
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(16777216)), ldc:int(0))) {
                var_2_577 = and:int(var_2_577:int, ldc:int(1310982865))
                goto(Label_0317)
            }
            
            if (cmpeq:boolean(and:int(var_2_577:int, ldc:int(8388608)), ldc:int(0))) {
                var_2_577 = and:int(var_2_577:int, ldc:int(-1054029773))
                goto(Label_0131)
            }
            
            var_2_577 = and:int(var_2_577:int, ldc:int(-474836802))
            stack_592_1 = and:int(ldc:int(-22410), ldc:int(21128))
            Label_1421:
            putfield:boolean(\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\u8d90\u839e\ud51e\u69d9\uf995\u71ae, stack_592_0:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523, stack_592_1:boolean)
            var_4_59F = or:int(shl:int(var_4_64:int, ldc:int(16)), invokevirtual:int(DataInputStream::readUnsignedShort, p0:DataInputStream))
            putfield:int(\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\u527a\u99f7\ucb79\u36d3\u446c\u4c04, this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523, and:int(shr:int(var_4_59F:int, and:int(ldc:int(517), ldc:int(8199))), xor:int(ldc:int(669), ldc:int(7522))))
            var_4_5C1 = or:int(shl:int(var_4_59F:int, ldc:int(8)), invokevirtual:int(FilterInputStream::read, p0:DataInputStream[expected:FilterInputStream]))
            putfield:int(\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\u4f52\u67e9\u4179\u392e\u9033\u61a4, this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523, and:int(shr:int(var_4_5C1:int, and:int(ldc:int(2562), ldc:int(20546))), and:int(ldc:int(28671), ldc:int(2047))))
            putfield:int(\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\u3dd3\ud217\u61a4\u3bc9\u385b\u67e9, this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523, and:int(var_4_5C1:int, and:int(ldc:int(29187), ldc:int(2515))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u61a4\u8709\u67d0\u4f52\ub70c\u6d99() {
        var_1_5F : int
        stack_80_0 : int [generated]
        stack_80_1 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(-1230674963), ldc:int(-268618892))
            stack_80_0 = getfield:int(\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\u527a\u99f7\ucb79\u36d3\u446c\u4c04, this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523)
            
            if (logicalnot:boolean(getfield:boolean(\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\uc4d2\uceb8\uc9f6\u8cae\u51fa\u8c8a, this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-1112183940))
                stack_80_1 = ldc:int(9)
            }
            else {
                stack_80_1 = ldc:int(7)
            }
            
            return:int(sub:int(stack_80_0:int, stack_80_1:int))
        }
        
        goto(Label_0006)
    }
    
    public byte[] \u97e6\u927d\u98a4\ubefe\u392e\u927d() {
        expr_9C : byte[] [generated]
        expr_A5 : int [generated]
        expr_D7 : byte[] [generated]
        expr_E0 : int [generated]
        
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
            
            if (cmpeq:boolean(getfield:byte[](\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\u7c6b\u9937\u960f\u8d90\ub19c\u0b8e, this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523), aconstnull:byte[]())) {
                storeelement:byte(putfield:byte[](\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\u7c6b\u9937\u960f\u8d90\ub19c\u0b8e, this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523, newarray:byte[](byte.class, xor:int(ldc:int(9284), ldc:int(9286)))), and:int(ldc:int(-21231), ldc:int(21166)), i2b:byte(shl:int(getfield:int(\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\ud523\uae5d\u47c2\u836c\uae5d\ua61f, this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523), and:int(ldc:int(11), ldc:int(29955)))))
                expr_9C = getfield:byte[](\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\u7c6b\u9937\u960f\u8d90\ub19c\u0b8e, this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523)
                expr_A5 = and:int(ldc:int(-26052), ldc:int(26050))
                storeelement:byte(expr_9C:byte[], expr_A5:int, i2b:byte(or:int(loadelement:byte(expr_9C:byte[], expr_A5:int), and:int(shr:int(getfield:int(\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\u3bc9\u759a\uc910\u3d64\u960f\u47c2, this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523), and:int(ldc:int(8945), ldc:int(19471))), ldc:int(7)))))
                storeelement:byte(getfield:byte[](\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\u7c6b\u9937\u960f\u8d90\ub19c\u0b8e, this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523), and:int(ldc:int(19457), ldc:int(277)), i2b:byte(shl:int(and:int(getfield:int(\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\u3bc9\u759a\uc910\u3d64\u960f\u47c2, this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523), and:int(ldc:int(2117), ldc:int(41))), ldc:int(7))))
                expr_D7 = getfield:byte[](\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\u7c6b\u9937\u960f\u8d90\ub19c\u0b8e, this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523)
                expr_E0 = and:int(ldc:int(519), ldc:int(13569))
                storeelement:byte(expr_D7:byte[], expr_E0:int, i2b:byte(or:int(loadelement:byte(expr_D7:byte[], expr_E0:int), shl:int(getfield:int(\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\ubf56\ucef1\u836c\uf94d\ub19c\ud171, this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523), and:int(ldc:int(6403), ldc:int(51))))))
            }
            
            return:byte[](getfield:byte[](\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\u7c6b\u9937\u960f\u8d90\ub19c\u0b8e, this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523))
        }
        
        goto(Label_0006)
    }
    
    public int \ua6bd\u1833\ubefe\ua3b4\ud36e\ubff1() {
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
            return:int(invokevirtual:int(\u5bc4\u385b\ubefe\u8cae\u97b7\u385b::\u7c6b\ub1b9\u0c95\ud7e8\u4179\uc84e, invokestatic:\u5bc4\u385b\ubefe\u8cae\u97b7\u385b(\u5bc4\u385b\ubefe\u8cae\u97b7\u385b::\uf9c5\u3c25\ub19c\u516c\ube23\ub6ab, getfield:int(\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\u3bc9\u759a\uc910\u3d64\u960f\u47c2, this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523))))
        }
        
        goto(Label_0006)
    }
    
    public int \u5fe1\ub113\u88c5\u3dd3\u8258\u51b2() {
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
            return:int(invokevirtual:int(\u120d\uc31c\u3711\ud12e\u600f\u8bb0::\u0800\u8cae\uc4d2\u5fe1\u3bd6\ufe34, invokestatic:\u120d\uc31c\u3711\ud12e\u600f\u8bb0(\u120d\uc31c\u3711\ud12e\u600f\u8bb0::\ub6ab\ud217\uc238\ub18d\ua068\u6b0d, getfield:int(\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\ubf56\ucef1\u836c\uf94d\ub19c\ud171, this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523))))
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
    
    public void \u7049\uae87\u6b0d\u446c\u446c\u76bc(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_685 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DB : int
        var_11_EC : int
        var_14_116 : double
        var_16_11A : int
        var_12_112 : double
        var_17_690 : int
        
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
        var_3_685 = and:int(ldc:int(603199835), ldc:int(-2042787541))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_685 = and:int(var_3_685:int, ldc:int(472497109))
        }
        else {
            var_3_685 = and:int(var_3_685:int, ldc:int(1516559261))
            var_5_85 = and:int(ldc:int(-32132), ldc:int(7297))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(2454), ldc:int(-18903)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DB = and:int(var_3_685:int, ldc:int(-818149109))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EC = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EC:int, sub:int(var_6_8C:int, and:int(ldc:int(17433), ldc:int(8195)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EC:int, and:int(ldc:int(27073), ldc:int(33)))), var_7_9B:double))) {
                        inc:int(var_11_EC, ldc:int(1))
                    }
                    
                    var_3_685 = and:int(var_3_DB:int, ldc:int(1728043965))
                    var_14_116 = var_7_9B:double
                    var_16_11A = var_11_EC:int
                }
                else {
                    var_11_EC = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(8237), ldc:int(16385)))
                    var_12_112 = var_14_116 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_11A = var_11_EC:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EC:int)
                        var_16_11A = var_11_EC:int
                        var_14_116 = var_12_112:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(1748200805))
                        goto(Label_1550)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(32)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1751694435))
                        goto(Label_1388)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1239)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0972)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(1622477734))
                        goto(Label_0851)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1946781450))
                        goto(Label_0704)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(1992091967))
                        
                        if (cmplt:boolean(var_16_11A:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0564)
                            }
                            
                            goto(Label_0851)
                        }
                    }
                    
                    Label_0409:
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(8)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1925240121))
                        goto(Label_1550)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1388)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1365953349))
                        goto(Label_1239)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(8)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-470138041))
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0972)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0851)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0704)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(-1561993924))
                            var_11_EC = and:int(ldc:int(20934), ldc:int(-20935))
                            goto(Label_1539)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0564:
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-387850028))
                        goto(Label_1550)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(1614240391))
                        goto(Label_1388)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(32)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-211072461))
                        goto(Label_1239)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(1857915889))
                        goto(Label_0972)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1826924720))
                        goto(Label_0851)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(85088196))
                            goto(Label_0409)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_685 = and:int(var_3_685:int, ldc:int(929430878))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_116 = var_9_C9:double
                            goto(Label_0851)
                        }
                    }
                    
                    Label_0704:
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(256)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(265108451))
                        goto(Label_1550)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1388)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1239)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(8)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(1879124712))
                        goto(Label_1128)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1983881041))
                        goto(Label_0972)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(512)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(-1323240189))
                            goto(Label_0564)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(-1266968897))
                            goto(Label_0409)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(256)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(-1973929855))
                            loopcontinue()
                        }
                        
                        var_3_685 = and:int(var_3_685:int, ldc:int(393555790))
                        var_14_116 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_116:double))
                    }
                    
                    Label_0851:
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1377711180))
                        goto(Label_1550)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1388)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1239)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(137816673))
                        goto(Label_1128)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(32)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1756489276))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(8)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(-1930007832))
                            goto(Label_0704)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0564)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0409)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1435108071))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EC = and:int(ldc:int(6161), ldc:int(18115))
                                goto(Label_1128)
                            }
                        }
                    }
                    
                    Label_0972:
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1550)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1954113754))
                        goto(Label_1388)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1239)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(852092972))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(-1018344157))
                            goto(Label_0851)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0704)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0564)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0409)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(465813797))
                            loopcontinue()
                        }
                        
                        var_3_685 = and:int(var_3_685:int, ldc:int(1914998761))
                        var_11_EC = and:int(ldc:int(-29528), ldc:int(12887))
                    }
                    
                    Label_1128:
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(256)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(1146442750))
                        goto(Label_1550)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1388)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0972)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(-887864526))
                            goto(Label_0851)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0704)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(-1950710505))
                            goto(Label_0564)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0409)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_685 = and:int(var_3_685:int, ldc:int(1454743341))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EC:int, ldc:int(0))) {
                                goto(Label_1388)
                            }
                        }
                    }
                    
                    Label_1239:
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(32)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-2115244282))
                        goto(Label_1550)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-611866802))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_1128)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0972)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(1683040473))
                            goto(Label_0851)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(1712001078))
                            goto(Label_0704)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(28736783))
                            goto(Label_0564)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0409)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(2008122739))
                            loopcontinue()
                        }
                        
                        var_3_685 = and:int(var_3_685:int, ldc:int(-30028424))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_116:double, var_5_85:int, var_16_11A:int)
                        goto(Label_1539)
                    }
                    
                    Label_1388:
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1568955467))
                        goto(Label_1550)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(256)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(396989364))
                        goto(Label_1239)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-539601997))
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(256)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-463634392))
                        goto(Label_0972)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0851)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0704)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-2067335564))
                        goto(Label_0564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(256)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(812362664))
                        goto(Label_0409)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(2048)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_685 = and:int(var_3_685:int, ldc:int(-1641203304))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_116:double, ldc:double(0.0))
                    Label_1539:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_690 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EC:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1550:
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(512)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(741387925))
                        goto(Label_1388)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1049182770))
                        goto(Label_1239)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(8)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-2130379093))
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0972)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0851)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0704)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1187038949))
                        goto(Label_0564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0409)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(512)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1280332950))
                        var_17_690 = add:int(var_16_11A:int, xor:int(ldc:int(80), ldc:int(81)))
                        looporswitchbreak()
                    }
                    
                    var_3_685 = and:int(var_3_685:int, ldc:int(-32624222))
                }
                
                var_3_685 = and:int(var_3_685:int, ldc:int(916872968))
                
                if (cmple:boolean(var_5_85 = var_17_690:int, sub:int(var_6_8C:int, and:int(ldc:int(359), ldc:int(17537))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(524288)), ldc:int(0))) {
            var_3_685 = and:int(var_3_685:int, ldc:int(699982548))
            goto(Label_0106)
        }
    }
}
